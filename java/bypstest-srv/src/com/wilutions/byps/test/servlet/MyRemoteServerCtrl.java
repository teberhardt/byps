package com.wilutions.byps.test.servlet;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

import com.wilutions.byps.BAsyncResult;
import com.wilutions.byps.BClient;
import com.wilutions.byps.BException;
import com.wilutions.byps.BRemote;
import com.wilutions.byps.BServerRegistry;
import com.wilutions.byps.test.api.BClient_Testser;
import com.wilutions.byps.test.api.remote.BSkeleton_RemoteServerCtrl;

public class MyRemoteServerCtrl extends BSkeleton_RemoteServerCtrl {
	
	private BServerRegistry serverRegistry;
	private final static ConcurrentHashMap<String, BRemote> publishedRemotes = new ConcurrentHashMap<String, BRemote>();
	
	public MyRemoteServerCtrl() {
	}
	
	public void setServerRegistry(BServerRegistry serverRegistry) {
		this.serverRegistry = serverRegistry;
	}

	@Override
	public void async_publishRemote(String name, BRemote remote, boolean forwardToOtherServers,
			final BAsyncResult<Object> asyncResult) {
		
		try {
			publishedRemotes.put(name, remote);
			
			if (forwardToOtherServers) {
			
				final ArrayList<BClient> clients = serverRegistry.getForwardClientsToOtherServers();
				
				BAsyncResult<Object> outerResult = new BAsyncResult<Object>() {
					CountDownLatch cdl = new CountDownLatch(clients.size());
					public void setAsyncResult(Object obj, Throwable e) {
						cdl.countDown();
						if (cdl.getCount() == 0) {
							asyncResult.setAsyncResult(obj, e);
						}
					}
				};
				
				for (BClient client : clients) {
					BClient_Testser myclient = (BClient_Testser)client;
					myclient.remoteServerCtrl.async_publishRemote(name, remote, false, outerResult);
				}
			
			}
			else {
				asyncResult.setAsyncResult(null, null);
			}
			
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
		
		
	}

	@Override
	public BRemote getPublishedRemote(String name)
			throws BException, InterruptedException {
		return publishedRemotes.get(name);
	}

	public void removePublishedRemote(String name) {
		publishedRemotes.remove(name);
	}
}

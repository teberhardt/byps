﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

public class BStub_RemoteServerCtrl extends BStub implements RemoteServerCtrlAsync, java.io.Serializable {
	
	public final static long serialVersionUID = 1124545992L;
	
	public BStub_RemoteServerCtrl(final BTransport transport) {
		super(transport);		
	}
	
	public void publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_publishRemote(name, remote, fowardToOtherServers, asyncResult);
		asyncResult.getResult();		
	}
	public void async_publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteServerCtrl_publishRemote req = new BRequest_RemoteServerCtrl_publishRemote();		
		req.name = name;
		req.remote = remote;
		req.fowardToOtherServers = fowardToOtherServers;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public BRemote getPublishedRemote(java.lang.String name) throws BException, InterruptedException {
		final BSyncResult<BRemote> asyncResult = new BSyncResult<BRemote>();		
		async_getPublishedRemote(name, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getPublishedRemote(java.lang.String name, final BAsyncResult<BRemote> asyncResult) {
		BRequest_RemoteServerCtrl_getPublishedRemote req = new BRequest_RemoteServerCtrl_getPublishedRemote();		
		req.name = name;
		BAsyncResultReceiveMethod<BRemote> outerResult = new BAsyncResultReceiveMethod<BRemote>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void removePublishedRemote(java.lang.String name) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_removePublishedRemote(name, asyncResult);
		asyncResult.getResult();		
	}
	public void async_removePublishedRemote(java.lang.String name, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteServerCtrl_removePublishedRemote req = new BRequest_RemoteServerCtrl_removePublishedRemote();		
		req.name = name;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}

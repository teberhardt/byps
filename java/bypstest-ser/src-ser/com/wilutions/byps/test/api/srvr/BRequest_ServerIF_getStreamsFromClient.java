﻿package com.wilutions.byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
*/
@SuppressWarnings("all")
public final class BRequest_ServerIF_getStreamsFromClient implements BMethodRequest, BSerializable {

	
	private final static long serialVersionUID = 1415283169L;
	
	@Override
	public int getRemoteId() { return 1313562065; }
	
	@Override
	public void execute(BRemote remote, BAsyncResult<Object> asyncResult) throws Throwable {
		try {
			final ServerIF remoteT = (ServerIF)remote;			
			BAsyncResultSendMethod<java.util.List<java.io.InputStream>> outerResult = new BAsyncResultSendMethod<java.util.List<java.io.InputStream>>(asyncResult, new BResult_ServerIF_getStreamsFromClient());			
			remoteT.async_getStreamsFromClient(outerResult);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

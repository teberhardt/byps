﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteArrayTypes1dim_getByte implements BMethodRequest, BSerializable {

	
	private final static long serialVersionUID = 1645613945L;
	
	@Override
	public int getRemoteId() { return 1557084481; }
	
	@Override
	public void execute(BRemote remote, BAsyncResult<Object> asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes1dim remoteT = (RemoteArrayTypes1dim)remote;			
			BAsyncResultSendMethod<byte[]> outerResult = new BAsyncResultSendMethod<byte[]>(asyncResult, new BResult_RemoteArrayTypes1dim_getByte());			
			remoteT.async_getByte(outerResult);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

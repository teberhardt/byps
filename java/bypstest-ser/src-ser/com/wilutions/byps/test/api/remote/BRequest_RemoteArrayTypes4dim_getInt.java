﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteArrayTypes4dim_getInt implements BMethodRequest, BSerializable {

	
	private final static long serialVersionUID = 1589603233L;
	
	@Override
	public int getRemoteId() { return 1557173854; }
	
	@Override
	public void execute(BRemote remote, BAsyncResult<Object> asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dim remoteT = (RemoteArrayTypes4dim)remote;			
			BAsyncResultSendMethod<int[][][][]> outerResult = new BAsyncResultSendMethod<int[][][][]>(asyncResult, new BResult_RemoteArrayTypes4dim_getInt());			
			remoteT.async_getInt(outerResult);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

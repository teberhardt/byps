﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteArrayTypes4dim_getFloat implements BMethodRequest, BSerializable {

	
	private final static long serialVersionUID = 1402482290L;
	
	@Override
	public int getRemoteId() { return 1557173854; }
	
	@Override
	public void execute(BRemote remote, BAsyncResult<Object> asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dim remoteT = (RemoteArrayTypes4dim)remote;			
			BAsyncResultSendMethod<float[][][][]> outerResult = new BAsyncResultSendMethod<float[][][][]>(asyncResult, new BResult_RemoteArrayTypes4dim_getFloat());			
			remoteT.async_getFloat(outerResult);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

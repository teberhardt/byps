﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteServerCtrl_getPublishedRemote implements BMethodRequest, Serializable {

	public java.lang.String name;
	
	private final static long serialVersionUID = 1216543212L;
	
	@Override
	public int getRemoteId() { return 1124545992; }
	
	@Override
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteServerCtrlAsync __byps__remoteT = (RemoteServerCtrlAsync)__byps__remote;			
			BAsyncResultSendMethod<BRemote> __byps__outerResult = new BAsyncResultSendMethod<BRemote>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_16());			
			__byps__remoteT.async_getPublishedRemote(name, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

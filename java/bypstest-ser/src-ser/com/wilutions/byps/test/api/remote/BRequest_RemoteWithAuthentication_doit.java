﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteWithAuthentication_doit extends BMethodRequest implements Serializable {

	public com.wilutions.byps.test.api.auth.SessionInfo sess;
	public int value;
	
	public final static long serialVersionUID = 388793292L;
	
	public int getRemoteId() { return 1677934392; }
	
	// checkpoint com.wilutions.byps.gen.j.GenApiClass:628
	public void setSession(Object __byps__sess) {
		sess = (com.wilutions.byps.test.api.auth.SessionInfo)__byps__sess;
	}
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteWithAuthenticationAsync __byps__remoteT = (RemoteWithAuthenticationAsync)__byps__remote;			
			BAsyncResultSendMethod<Integer> __byps__outerResult = new BAsyncResultSendMethod<Integer>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_5());			
			__byps__remoteT.doit(sess, value, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

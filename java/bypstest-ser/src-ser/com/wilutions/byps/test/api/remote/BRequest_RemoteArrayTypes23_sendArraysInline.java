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
public final class BRequest_RemoteArrayTypes23_sendArraysInline extends BMethodRequest implements Serializable {

	public com.wilutions.byps.test.api.inl.Point2D[][] arr2;
	public com.wilutions.byps.test.api.inl.Point2D[][][] arr3;
	public com.wilutions.byps.test.api.inl.Point2D[][][][] arr4;
	
	public final static long serialVersionUID = 899462794L;
	
	public int getRemoteId() { return 2081058997; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes23Async __byps__remoteT = (RemoteArrayTypes23Async)__byps__remote;			
			BAsyncResultSendMethod<com.wilutions.byps.test.api.inl.Point2D[]> __byps__outerResult = new BAsyncResultSendMethod<com.wilutions.byps.test.api.inl.Point2D[]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_2049740106());			
			__byps__remoteT.sendArraysInline(arr2, arr3, arr4, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

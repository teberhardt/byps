package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteInlineInstance_getPoint2DArray4dim extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1012059475L;
	
	public int getRemoteId() { return 1206670536; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteInlineInstanceAsync __byps__remoteT = (RemoteInlineInstanceAsync)__byps__remote;			
			BAsyncResultSendMethod<com.wilutions.byps.test.api.inl.Point2D[][][][]> __byps__outerResult = new BAsyncResultSendMethod<com.wilutions.byps.test.api.inl.Point2D[][][][]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_487702928());			
			__byps__remoteT.getPoint2DArray4dim(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

package com.wilutions.byps.test.api.ver;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_EvolveIF_getEvolve extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 32041374L;
	
	public int getRemoteId() { return 2078696281; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final EvolveIFAsync __byps__remoteT = (EvolveIFAsync)__byps__remote;			
			BAsyncResultSendMethod<Evolve> __byps__outerResult = new BAsyncResultSendMethod<Evolve>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1391985860());			
			__byps__remoteT.getEvolve(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteMapTypes_getString1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1836497856L;
	
	public int getRemoteId() { return 1277224527; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteMapTypesAsync __byps__remoteT = (RemoteMapTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Map<java.lang.String,java.lang.String>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Map<java.lang.String,java.lang.String>>(__byps__asyncResult, new byps.test.api.BResult_1710660846());			
			__byps__remoteT.getString1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

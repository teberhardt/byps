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
public final class BRequest_RemoteMapTypes_getByte2 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 124722646L;
	
	public int getRemoteId() { return 1277224527; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteMapTypesAsync __byps__remoteT = (RemoteMapTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Map<java.lang.Integer,byte[]>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Map<java.lang.Integer,byte[]>>(__byps__asyncResult, new byps.test.api.BResult_1799280818());			
			__byps__remoteT.getByte2(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

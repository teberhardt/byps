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
public final class BRequest_RemoteArrayTypes1dim_getPrimitiveTypes extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1992537556L;
	
	public int getRemoteId() { return 1176140631; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes1dimAsync __byps__remoteT = (RemoteArrayTypes1dimAsync)__byps__remote;			
			BAsyncResultSendMethod<byps.test.api.prim.PrimitiveTypes[]> __byps__outerResult = new BAsyncResultSendMethod<byps.test.api.prim.PrimitiveTypes[]>(__byps__asyncResult, new byps.test.api.BResult_2053507648());			
			__byps__remoteT.getPrimitiveTypes(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

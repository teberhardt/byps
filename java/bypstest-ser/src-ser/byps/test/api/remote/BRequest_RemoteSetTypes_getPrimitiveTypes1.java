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
public final class BRequest_RemoteSetTypes_getPrimitiveTypes1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 669274715L;
	
	public int getRemoteId() { return 1900796440; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteSetTypesAsync __byps__remoteT = (RemoteSetTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Set<byps.test.api.prim.PrimitiveTypes>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Set<byps.test.api.prim.PrimitiveTypes>>(__byps__asyncResult, new byps.test.api.BResult_673917574());			
			__byps__remoteT.getPrimitiveTypes1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteSetTypes.getPrimitiveTypes1(");
		s.append(")]");
		return s.toString();
	}
	
}

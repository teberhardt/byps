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
public final class BRequest_RemoteSetTypes_getShort1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1711905425L;
	
	public int getRemoteId() { return 1900796440; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteSetTypesAsync __byps__remoteT = (RemoteSetTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Set<java.lang.Short>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Set<java.lang.Short>>(__byps__asyncResult, new byps.test.api.BResult_2028443792());			
			__byps__remoteT.getShort1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteSetTypes.getShort1(");
		s.append(")]");
		return s.toString();
	}
	
}

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
public final class BRequest_RemoteListTypes_getBoolean1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 2058662161L;
	
	public int getRemoteId() { return 1240892695; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteListTypesAsync __byps__remoteT = (RemoteListTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<java.lang.Boolean>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<java.lang.Boolean>>(__byps__asyncResult, new byps.test.api.BResult_1617670280());			
			__byps__remoteT.getBoolean1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

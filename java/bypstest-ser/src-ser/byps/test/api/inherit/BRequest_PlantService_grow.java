package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_PlantService_grow extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 695716901L;
	
	public int getRemoteId() { return 1733272281; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final PlantServiceAsync __byps__remoteT = (PlantServiceAsync)__byps__remote;			
			BAsyncResultSendMethod<String> __byps__outerResult = new BAsyncResultSendMethod<String>(__byps__asyncResult, new byps.test.api.BResult_10());			
			__byps__remoteT.grow(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

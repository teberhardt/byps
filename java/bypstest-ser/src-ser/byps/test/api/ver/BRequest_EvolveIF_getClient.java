package byps.test.api.ver;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_EvolveIF_getClient extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1212621223L;
	
	public int getRemoteId() { return 15377840; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final EvolveIFAsync __byps__remoteT = (EvolveIFAsync)__byps__remote;			
			BAsyncResultSendMethod<EvolveIF> __byps__outerResult = new BAsyncResultSendMethod<EvolveIF>(__byps__asyncResult, new byps.test.api.BResult_564008001());			
			__byps__remoteT.getClient(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[EvolveIF.getClient(");
		s.append(")]");
		return s.toString();
	}
	
}

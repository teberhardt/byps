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
public final class BRequest_RemoteArrayTypes4dim_getString extends BMethodRequest implements Serializable {

	
	public static final long serialVersionUID = 1121997496L;
	
	public int getRemoteId() { return 963726955; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dimAsync __byps__remoteT = (RemoteArrayTypes4dimAsync)__byps__remote;			
			BAsyncResultSendMethod<java.lang.String[][][][]> __byps__outerResult = new BAsyncResultSendMethod<java.lang.String[][][][]>(__byps__asyncResult, new byps.test.api.BResult_588723219());			
			__byps__remoteT.getString(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteArrayTypes4dim.getString(");
		s.append(")]");
		return s.toString();
	}
	
}

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
public final class BRequest_RemoteArrayTypes1dim_getDate extends BMethodRequest implements Serializable {

	
	public static final long serialVersionUID = 2033462920L;
	
	public int getRemoteId() { return 123123; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes1dimAsync __byps__remoteT = (RemoteArrayTypes1dimAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Date[]> __byps__outerResult = new BAsyncResultSendMethod<java.util.Date[]>(__byps__asyncResult, new byps.test.api.BResult_1406664368());			
			__byps__remoteT.getDate(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteArrayTypes1dim.getDate(");
		s.append(")]");
		return s.toString();
	}
	
}

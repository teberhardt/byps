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
public final class BRequest_RemoteArrayTypes4dim_getObject extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1253379978L;
	
	public int getRemoteId() { return 1176051258; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dimAsync __byps__remoteT = (RemoteArrayTypes4dimAsync)__byps__remote;			
			BAsyncResultSendMethod<java.lang.Object[][][][]> __byps__outerResult = new BAsyncResultSendMethod<java.lang.Object[][][][]>(__byps__asyncResult, new byps.test.api.BResult_124584219());			
			__byps__remoteT.getObject(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

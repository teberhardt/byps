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
public final class BRequest_RemoteArrayTypes4dim_getChar extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1874279859L;
	
	public int getRemoteId() { return 1176051258; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dimAsync __byps__remoteT = (RemoteArrayTypes4dimAsync)__byps__remote;			
			BAsyncResultSendMethod<char[][][][]> __byps__outerResult = new BAsyncResultSendMethod<char[][][][]>(__byps__asyncResult, new byps.test.api.BResult_769021986());			
			__byps__remoteT.getChar(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

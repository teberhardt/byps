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
public final class BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions extends BMethodRequest implements Serializable {

	public int sleepSeconds;
	
	public static final long serialVersionUID = 1155485035L;
	
	public int getRemoteId() { return 790485113; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteProcessingExAsync __byps__remoteT = (RemoteProcessingExAsync)__byps__remote;			
			BAsyncResultSendMethod<Boolean> __byps__outerResult = new BAsyncResultSendMethod<Boolean>(__byps__asyncResult, new byps.test.api.BResult_1());			
			__byps__remoteT.getValueAfterProcessingExceptions(sleepSeconds, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteProcessingEx.getValueAfterProcessingExceptions(");
		s.append(BBuffer.paramToString(sleepSeconds));
		s.append(")]");
		return s.toString();
	}
	
}

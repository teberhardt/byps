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
public final class BRequest_RemoteStreams_setImages extends BMethodRequest implements Serializable {

	public java.util.Map<java.lang.Integer,java.io.InputStream> istrms;
	public int doNotReadStreamAtKey;
	
	public static final long serialVersionUID = 2126615710L;
	
	public int getRemoteId() { return 1043578866; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteStreamsAsync __byps__remoteT = (RemoteStreamsAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new byps.test.api.BResult_19());			
			__byps__remoteT.setImages(istrms, doNotReadStreamAtKey, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteStreams.setImages(");
		s.append(BBuffer.paramToString(istrms));
		s.append(",").append(BBuffer.paramToString(doNotReadStreamAtKey));
		s.append(")]");
		return s.toString();
	}
	
}

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
public final class BRequest_RemoteMapTypes_getFloat1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 530925397L;
	
	public int getRemoteId() { return 664304990; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteMapTypesAsync __byps__remoteT = (RemoteMapTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Map<java.lang.Character,java.lang.Float>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Map<java.lang.Character,java.lang.Float>>(__byps__asyncResult, new byps.test.api.BResult_94341197());			
			__byps__remoteT.getFloat1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteMapTypes.getFloat1(");
		s.append(")]");
		return s.toString();
	}
	
}

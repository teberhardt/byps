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
public final class BRequest_RemoteArrayTypes23_sendArraysString extends BMethodRequest implements Serializable {

	public java.lang.String[][] arr2;
	public java.lang.String[][][] arr3;
	public java.lang.String[][][][] arr4;
	
	public static final long serialVersionUID = 1175231899L;
	
	public int getRemoteId() { return 769717182; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes23Async __byps__remoteT = (RemoteArrayTypes23Async)__byps__remote;			
			BAsyncResultSendMethod<java.lang.String[]> __byps__outerResult = new BAsyncResultSendMethod<java.lang.String[]>(__byps__asyncResult, new byps.test.api.BResult_1888107655());			
			__byps__remoteT.sendArraysString(arr2, arr3, arr4, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteArrayTypes23.sendArraysString(");
		s.append(BBuffer.paramToString(arr2));
		s.append(",").append(BBuffer.paramToString(arr3));
		s.append(",").append(BBuffer.paramToString(arr4));
		s.append(")]");
		return s.toString();
	}
	
}

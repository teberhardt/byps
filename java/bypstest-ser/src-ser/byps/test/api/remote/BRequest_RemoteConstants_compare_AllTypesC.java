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
public final class BRequest_RemoteConstants_compare_AllTypesC extends BMethodRequest implements Serializable {

	public boolean bool1s;
	public boolean bool2s;
	public char char1s;
	public java.lang.String stringNull;
	public char char2s;
	public short short1s;
	public int int1s;
	public long long1s;
	public float float1s;
	public double double1s;
	public java.lang.String string1s;
	public byps.test.api.cons.AllTypesZ ALL;
	public int[] arrInt;
	public int[][][][] arrInt4;
	public java.lang.String[] arrStrings;
	public java.lang.String[][][][] arrStrings4;
	public byps.test.api.cons.AllTypesZ[][] arrAll;
	
	public final static long serialVersionUID = 1609344203L;
	
	public int getRemoteId() { return 429088323; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteConstantsAsync __byps__remoteT = (RemoteConstantsAsync)__byps__remote;			
			BAsyncResultSendMethod<Boolean> __byps__outerResult = new BAsyncResultSendMethod<Boolean>(__byps__asyncResult, new byps.test.api.BResult_1());			
			__byps__remoteT.compare_AllTypesC(bool1s, bool2s, char1s, stringNull, char2s, short1s, int1s, long1s, float1s, double1s, string1s, ALL, arrInt, arrInt4, arrStrings, arrStrings4, arrAll, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

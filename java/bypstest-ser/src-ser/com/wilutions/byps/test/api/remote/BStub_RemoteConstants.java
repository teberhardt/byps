﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

public class BStub_RemoteConstants extends BStub implements RemoteConstantsAsync, java.io.Serializable {
	
	public final static long serialVersionUID = 431648293L;
	
	public BStub_RemoteConstants(final BTransport transport) {
		super(transport);		
	}
	
	public void compare_HebrewC(com.wilutions.byps.test.api.cons.HebrewZ ALEPH, com.wilutions.byps.test.api.cons.HebrewZ BETH) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_compare_HebrewC(ALEPH, BETH, asyncResult);
		asyncResult.getResult();		
	}
	public void async_compare_HebrewC(com.wilutions.byps.test.api.cons.HebrewZ ALEPH, com.wilutions.byps.test.api.cons.HebrewZ BETH, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteConstants_compare_HebrewC req = new BRequest_RemoteConstants_compare_HebrewC();		
		req.ALEPH = ALEPH;
		req.BETH = BETH;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public boolean compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, com.wilutions.byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, com.wilutions.byps.test.api.cons.AllTypesZ[][] arrAll) throws BException, InterruptedException {
		final BSyncResult<Boolean> asyncResult = new BSyncResult<Boolean>();		
		async_compare_AllTypesC(bool1s, bool2s, char1s, stringNull, char2s, short1s, int1s, long1s, float1s, double1s, string1s, ALL, arrInt, arrInt4, arrStrings, arrStrings4, arrAll, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, com.wilutions.byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, com.wilutions.byps.test.api.cons.AllTypesZ[][] arrAll, final BAsyncResult<Boolean> asyncResult) {
		BRequest_RemoteConstants_compare_AllTypesC req = new BRequest_RemoteConstants_compare_AllTypesC();		
		req.bool1s = bool1s;
		req.bool2s = bool2s;
		req.char1s = char1s;
		req.stringNull = stringNull;
		req.char2s = char2s;
		req.short1s = short1s;
		req.int1s = int1s;
		req.long1s = long1s;
		req.float1s = float1s;
		req.double1s = double1s;
		req.string1s = string1s;
		req.ALL = ALL;
		req.arrInt = arrInt;
		req.arrInt4 = arrInt4;
		req.arrStrings = arrStrings;
		req.arrStrings4 = arrStrings4;
		req.arrAll = arrAll;
		BAsyncResultReceiveMethod<Boolean> outerResult = new BAsyncResultReceiveMethod<Boolean>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}
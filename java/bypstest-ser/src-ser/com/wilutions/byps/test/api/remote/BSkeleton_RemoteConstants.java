﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteConstants.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteConstants extends BSkeleton implements RemoteConstantsAsync {
	
	public final static long serialVersionUID = 431648293L;
	
	@Override
	public void compare_HebrewC(com.wilutions.byps.test.api.cons.HebrewZ ALEPH, com.wilutions.byps.test.api.cons.HebrewZ BETH) throws BException, InterruptedException {
		throw new BException(BException.UNSUPPORTED_METHOD, "");
	}
	@Override
	public void async_compare_HebrewC(com.wilutions.byps.test.api.cons.HebrewZ ALEPH, com.wilutions.byps.test.api.cons.HebrewZ BETH, final BAsyncResult<Object> asyncResult) {
		try {
			compare_HebrewC(ALEPH, BETH);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	@Override
	public boolean compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, com.wilutions.byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, com.wilutions.byps.test.api.cons.AllTypesZ[][] arrAll) throws BException, InterruptedException {
		throw new BException(BException.UNSUPPORTED_METHOD, "");
	}
	@Override
	public void async_compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, com.wilutions.byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, com.wilutions.byps.test.api.cons.AllTypesZ[][] arrAll, final BAsyncResult<Boolean> asyncResult) {
		try {
			boolean ret = compare_AllTypesC(bool1s, bool2s, char1s, stringNull, char2s, short1s, int1s, long1s, float1s, double1s, string1s, ALL, arrInt, arrInt4, arrStrings, arrStrings4, arrAll);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}

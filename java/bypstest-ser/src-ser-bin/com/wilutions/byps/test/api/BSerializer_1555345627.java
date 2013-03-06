﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Double>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1555345627 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1555345627();
	
	public BSerializer_1555345627() {
		super(1555345627);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<java.lang.Double> arr = new ArrayList<java.lang.Double>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Double obj = bbuf.getDouble();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.lang.Double> arr = (java.util.List<java.lang.Double>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Double obj : arr) {
			bbuf.putDouble(obj != null ? (Double)obj : 0.0);
		}
	}
	
}

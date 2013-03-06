﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Float>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1628501332 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1628501332();
	
	public BSerializer_1628501332() {
		super(1628501332);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<java.lang.Float> arr = new ArrayList<java.lang.Float>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Float obj = bbuf.getFloat();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.lang.Float> arr = (java.util.List<java.lang.Float>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Float obj : arr) {
			bbuf.putFloat(obj != null ? (Float)obj : 0.0f);
		}
	}
	
}

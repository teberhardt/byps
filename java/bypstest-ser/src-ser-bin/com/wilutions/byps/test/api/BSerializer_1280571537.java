﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Set<com.wilutions.byps.test.api.prim.PrimitiveTypes>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1280571537 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1280571537();
	
	public BSerializer_1280571537() {
		super(1280571537);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final HashSet<com.wilutions.byps.test.api.prim.PrimitiveTypes> arr = new HashSet<com.wilutions.byps.test.api.prim.PrimitiveTypes>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			com.wilutions.byps.test.api.prim.PrimitiveTypes obj = (com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj(false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.Set<com.wilutions.byps.test.api.prim.PrimitiveTypes> arr = (java.util.Set<com.wilutions.byps.test.api.prim.PrimitiveTypes>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (com.wilutions.byps.test.api.prim.PrimitiveTypes obj : arr) {
			bout.writeObj(obj, false, null);
		}
	}
	
}

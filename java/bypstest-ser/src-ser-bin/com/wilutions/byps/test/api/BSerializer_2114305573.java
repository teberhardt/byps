﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Set<com.wilutions.byps.test.api.inherit.Class1>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_2114305573 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2114305573();
	
	public BSerializer_2114305573() {
		super(2114305573);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final HashSet<com.wilutions.byps.test.api.inherit.Class1> arr = new HashSet<com.wilutions.byps.test.api.inherit.Class1>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			com.wilutions.byps.test.api.inherit.Class1 obj = (com.wilutions.byps.test.api.inherit.Class1)bin.readObj(false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.Set<com.wilutions.byps.test.api.inherit.Class1> arr = (java.util.Set<com.wilutions.byps.test.api.inherit.Class1>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (com.wilutions.byps.test.api.inherit.Class1 obj : arr) {
			bout.writeObj(obj, false, null);
		}
	}
	
}

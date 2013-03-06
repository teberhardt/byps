﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1544333227 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1544333227();
	
	public JSerializer_1544333227() {
		super(1544333227);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<com.wilutions.byps.test.api.prim.PrimitiveTypes> arr = new ArrayList<com.wilutions.byps.test.api.prim.PrimitiveTypes>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			com.wilutions.byps.test.api.prim.PrimitiveTypes obj = (com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj(i0, false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes> arr = (java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (com.wilutions.byps.test.api.prim.PrimitiveTypes obj : arr) {
			bout.writeObj(null, obj, false, null);
		}
		bbuf.endArray();
	}
	
}

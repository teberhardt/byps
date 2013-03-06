﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Short>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1997002548 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1997002548();
	
	public JSerializer_1997002548() {
		super(1997002548);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<java.lang.Short> arr = new ArrayList<java.lang.Short>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Short obj = bin.currentObject.getShort(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<java.lang.Short> arr = (java.util.List<java.lang.Short>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.lang.Short obj : arr) {
			bbuf.putShort(obj != null ? (Short)obj : ((short)0));
		}
		bbuf.endArray();
	}
	
}

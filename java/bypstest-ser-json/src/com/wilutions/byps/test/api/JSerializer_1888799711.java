﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Set<java.lang.String>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1888799711 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1888799711();
	
	public JSerializer_1888799711() {
		super(1888799711);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final HashSet<java.lang.String> arr = new HashSet<java.lang.String>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.String obj = bin.currentObject.getString(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.Set<java.lang.String> arr = (java.util.Set<java.lang.String>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.lang.String obj : arr) {
			bbuf.putString(obj != null ? (String)obj : "");
		}
		bbuf.endArray();
	}
	
}

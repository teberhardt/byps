﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.io.InputStream>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1218831438 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1218831438();
	
	public JSerializer_1218831438() {
		super(1218831438);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<java.io.InputStream> arr = new ArrayList<java.io.InputStream>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.io.InputStream obj = (java.io.InputStream)bin.readObj(i0, false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<java.io.InputStream> arr = (java.util.List<java.io.InputStream>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.io.InputStream obj : arr) {
			bout.writeObj(null, obj, false, null);
		}
		bbuf.endArray();
	}
	
}

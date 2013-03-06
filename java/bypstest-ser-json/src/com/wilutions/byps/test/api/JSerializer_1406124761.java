﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Set<int[]>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1406124761 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1406124761();
	
	public JSerializer_1406124761() {
		super(1406124761);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final HashSet<int[]> arr = new HashSet<int[]>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			int[] obj = (int[])bin.readObj(i0, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.Set<int[]> arr = (java.util.Set<int[]>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (int[] obj : arr) {
			bout.writeObj(null, obj, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		}
		bbuf.endArray();
	}
	
}

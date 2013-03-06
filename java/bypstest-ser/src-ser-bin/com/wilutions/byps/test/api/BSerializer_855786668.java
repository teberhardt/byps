﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.TreeSet<java.lang.Integer>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_855786668 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_855786668();
	
	public BSerializer_855786668() {
		super(855786668);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final TreeSet<java.lang.Integer> arr = new TreeSet<java.lang.Integer>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Integer obj = bbuf.getInt();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.TreeSet<java.lang.Integer> arr = (java.util.TreeSet<java.lang.Integer>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Integer obj : arr) {
			bbuf.putInt(obj != null ? (Integer)obj : 0);
		}
	}
	
}

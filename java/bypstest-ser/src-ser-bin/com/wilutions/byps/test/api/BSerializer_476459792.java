﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.TreeMap<java.lang.Integer,java.io.InputStream>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_476459792 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_476459792();
	
	public BSerializer_476459792() {
		super(476459792);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final TreeMap<java.lang.Integer,java.io.InputStream> map = new TreeMap<java.lang.Integer,java.io.InputStream>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Integer key = bbuf.getInt();
			java.io.InputStream value = (java.io.InputStream)bin.readObj(false, null);
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		TreeMap<java.lang.Integer,java.io.InputStream> map = (TreeMap<java.lang.Integer,java.io.InputStream>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Integer,java.io.InputStream> obj : map.entrySet()) {
			bbuf.putInt(obj.getKey() != null ? (Integer)obj.getKey() : 0);
			bout.writeObj(obj.getValue(), false, null);
		}
	}
	
}

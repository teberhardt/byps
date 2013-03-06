﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.String,java.lang.Boolean>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1279823631 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1279823631();
	
	public BSerializer_1279823631() {
		super(1279823631);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.String,java.lang.Boolean> map = new HashMap<java.lang.String,java.lang.Boolean>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.String key = bbuf.getString();
			java.lang.Boolean value = bbuf.getBoolean();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.String,java.lang.Boolean> map = (Map<java.lang.String,java.lang.Boolean>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.String,java.lang.Boolean> obj : map.entrySet()) {
			bbuf.putString(obj.getKey() != null ? (String)obj.getKey() : "");
			bbuf.putBoolean(obj.getValue() != null ? (Boolean)obj.getValue() : false);
		}
	}
	
}

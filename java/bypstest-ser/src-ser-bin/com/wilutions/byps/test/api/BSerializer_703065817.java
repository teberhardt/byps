﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_703065817 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_703065817();
	
	public BSerializer_703065817() {
		super(703065817);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes> map = new HashMap<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Integer key = bbuf.getInt();
			com.wilutions.byps.test.api.prim.PrimitiveTypes value = (com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj(false, null);
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes> map = (Map<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes> obj : map.entrySet()) {
			bbuf.putInt(obj.getKey() != null ? (Integer)obj.getKey() : 0);
			bout.writeObj(obj.getValue(), false, null);
		}
	}
	
}

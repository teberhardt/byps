﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Short,java.lang.Long>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1973996106 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1973996106();
	
	public BSerializer_1973996106() {
		super(1973996106);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Short,java.lang.Long> map = new HashMap<java.lang.Short,java.lang.Long>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Short key = bbuf.getShort();
			java.lang.Long value = bbuf.getLong();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.Short,java.lang.Long> map = (Map<java.lang.Short,java.lang.Long>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Short,java.lang.Long> obj : map.entrySet()) {
			bbuf.putShort(obj.getKey() != null ? (Short)obj.getKey() : ((short)0));
			bbuf.putLong(obj.getValue() != null ? (Long)obj.getValue() : 0L);
		}
	}
	
}

﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Byte,java.lang.Double>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1487265161 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1487265161();
	
	public BSerializer_1487265161() {
		super(1487265161);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Byte,java.lang.Double> map = new HashMap<java.lang.Byte,java.lang.Double>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Byte key = bbuf.getByte();
			java.lang.Double value = bbuf.getDouble();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.Byte,java.lang.Double> map = (Map<java.lang.Byte,java.lang.Double>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Byte,java.lang.Double> obj : map.entrySet()) {
			bbuf.putByte(obj.getKey() != null ? (Byte)obj.getKey() : ((byte)0));
			bbuf.putDouble(obj.getValue() != null ? (Double)obj.getValue() : 0.0);
		}
	}
	
}

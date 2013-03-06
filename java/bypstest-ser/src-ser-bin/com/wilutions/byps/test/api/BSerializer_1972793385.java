﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.HashMap<java.lang.Double,java.lang.Byte>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1972793385 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1972793385();
	
	public BSerializer_1972793385() {
		super(1972793385);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Double,java.lang.Byte> map = new HashMap<java.lang.Double,java.lang.Byte>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Double key = bbuf.getDouble();
			java.lang.Byte value = bbuf.getByte();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		HashMap<java.lang.Double,java.lang.Byte> map = (HashMap<java.lang.Double,java.lang.Byte>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Double,java.lang.Byte> obj : map.entrySet()) {
			bbuf.putDouble(obj.getKey() != null ? (Double)obj.getKey() : 0.0);
			bbuf.putByte(obj.getValue() != null ? (Byte)obj.getValue() : ((byte)0));
		}
	}
	
}

package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.TreeMap<java.lang.Float,java.lang.Character>
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerMap DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_8789515 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_8789515();
	
	public BSerializer_8789515() {
		super(8789515);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final TreeMap<java.lang.Float,java.lang.Character> map = new TreeMap<java.lang.Float,java.lang.Character>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Float key = bbuf.getFloat();
			java.lang.Character value = bbuf.getChar();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		TreeMap<java.lang.Float,java.lang.Character> map = (TreeMap<java.lang.Float,java.lang.Character>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Float,java.lang.Character> obj : map.entrySet()) {
			bbuf.putFloat(obj.getKey() != null ? (Float)obj.getKey() : 0.0f);
			bbuf.putChar(obj.getValue() != null ? (Character)obj.getValue() : ((char)0));
		}
	}
	
}

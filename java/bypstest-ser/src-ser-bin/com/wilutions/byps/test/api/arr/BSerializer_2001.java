﻿package com.wilutions.byps.test.api.arr;

/*
 * Serializer for com.wilutions.byps.test.api.arr.ArrayTypes1dim
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=10

@SuppressWarnings("all")
public class BSerializer_2001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2001();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: boolean1 */ + 4		
		       /* pos=4: byte1 */ + 4		
		       /* pos=8: char1 */ + 4		
		       /* pos=12: short1 */ + 4		
		       /* pos=16: int1 */ + 4		
		       /* pos=20: long1 */ + 4		
		       /* pos=24: float1 */ + 4		
		       /* pos=28: double1 */ + 4		
		       /* pos=32: string1 */ + 4		
		       /* pos=36: primitiveTypes1 */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_2001() {
		super(2001);
	}
	
	public BSerializer_2001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final ArrayTypes1dim obj = (ArrayTypes1dim)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean1, false, com.wilutions.byps.test.api.BSerializer_2058423690.instance);
		bout.writeObj(obj.byte1, false, com.wilutions.byps.test.api.BSerializer_1374008726.instance);
		bout.writeObj(obj.char1, false, com.wilutions.byps.test.api.BSerializer_1361632968.instance);
		bout.writeObj(obj.double1, false, com.wilutions.byps.test.api.BSerializer_1359468275.instance);
		bout.writeObj(obj.float1, false, com.wilutions.byps.test.api.BSerializer_766441794.instance);
		bout.writeObj(obj.int1, false, com.wilutions.byps.test.api.BSerializer_100361105.instance);
		bout.writeObj(obj.long1, false, com.wilutions.byps.test.api.BSerializer_1097129250.instance);
		bout.writeObj(obj.primitiveTypes1, false, com.wilutions.byps.test.api.BSerializer_801243127.instance);
		bout.writeObj(obj.short1, false, com.wilutions.byps.test.api.BSerializer_2067161310.instance);
		bout.writeObj(obj.string1, true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final ArrayTypes1dim obj = (ArrayTypes1dim)(obj1 != null ? obj1 : bin.onObjectCreated(new ArrayTypes1dim()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean1 = (boolean[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2058423690.instance);
		obj.byte1 = (byte[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1374008726.instance);
		obj.char1 = (char[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1361632968.instance);
		obj.double1 = (double[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1359468275.instance);
		obj.float1 = (float[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_766441794.instance);
		obj.int1 = (int[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_100361105.instance);
		obj.long1 = (long[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1097129250.instance);
		obj.primitiveTypes1 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_801243127.instance);
		obj.short1 = (short[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2067161310.instance);
		obj.string1 = (java.lang.String[])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
		
		return obj;
	}
	
}

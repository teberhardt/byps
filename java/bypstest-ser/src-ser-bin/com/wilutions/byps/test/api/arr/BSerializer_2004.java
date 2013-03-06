﻿package com.wilutions.byps.test.api.arr;

/*
 * Serializer for com.wilutions.byps.test.api.arr.ArrayTypes4dim
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
public class BSerializer_2004 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2004();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: boolean4 */ + 4		
		       /* pos=4: byte4 */ + 4		
		       /* pos=8: char4 */ + 4		
		       /* pos=12: short4 */ + 4		
		       /* pos=16: int4 */ + 4		
		       /* pos=20: long4 */ + 4		
		       /* pos=24: float4 */ + 4		
		       /* pos=28: double4 */ + 4		
		       /* pos=32: string4 */ + 4		
		       /* pos=36: primitiveTypes4 */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_2004() {
		super(2004);
	}
	
	public BSerializer_2004(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final ArrayTypes4dim obj = (ArrayTypes4dim)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean4, false, com.wilutions.byps.test.api.BSerializer_945713488.instance);
		bout.writeObj(obj.byte4, false, com.wilutions.byps.test.api.BSerializer_1201775504.instance);
		bout.writeObj(obj.char4, false, com.wilutions.byps.test.api.BSerializer_769021986.instance);
		bout.writeObj(obj.double4, false, com.wilutions.byps.test.api.BSerializer_2087445849.instance);
		bout.writeObj(obj.float4, false, com.wilutions.byps.test.api.BSerializer_1516687588.instance);
		bout.writeObj(obj.int4, false, com.wilutions.byps.test.api.BSerializer_39910537.instance);
		bout.writeObj(obj.long4, false, com.wilutions.byps.test.api.BSerializer_846419204.instance);
		bout.writeObj(obj.primitiveTypes4, false, com.wilutions.byps.test.api.BSerializer_1503107601.instance);
		bout.writeObj(obj.short4, false, com.wilutions.byps.test.api.BSerializer_1859644668.instance);
		bout.writeObj(obj.string4, true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final ArrayTypes4dim obj = (ArrayTypes4dim)(obj1 != null ? obj1 : bin.onObjectCreated(new ArrayTypes4dim()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean4 = (boolean[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_945713488.instance);
		obj.byte4 = (byte[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1201775504.instance);
		obj.char4 = (char[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_769021986.instance);
		obj.double4 = (double[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2087445849.instance);
		obj.float4 = (float[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1516687588.instance);
		obj.int4 = (int[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_39910537.instance);
		obj.long4 = (long[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_846419204.instance);
		obj.primitiveTypes4 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1503107601.instance);
		obj.short4 = (short[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1859644668.instance);
		obj.string4 = (java.lang.String[][][][])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
		
		return obj;
	}
	
}

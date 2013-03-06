﻿package com.wilutions.byps.test.api.set;

/*
 * Serializer for com.wilutions.byps.test.api.set.SetTypes
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=13

@SuppressWarnings("all")
public class BSerializer_5001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_5001();
	
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
		       /* pos=40: byte2 */ + 4		
		       /* pos=44: int2 */ + 4		
		       /* pos=48: obj1 */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_5001() {
		super(5001);
	}
	
	public BSerializer_5001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final SetTypes obj = (SetTypes)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean1, false, com.wilutions.byps.test.api.BSerializer_1365696060.instance);
		bout.writeObj(obj.byte1, false, com.wilutions.byps.test.api.BSerializer_31512998.instance);
		bout.writeObj(obj.byte2, false, com.wilutions.byps.test.api.BSerializer_2052431866.instance);
		bout.writeObj(obj.char1, false, com.wilutions.byps.test.api.BSerializer_936607009.instance);
		bout.writeObj(obj.double1, false, com.wilutions.byps.test.api.BSerializer_1320560671.instance);
		bout.writeObj(obj.float1, false, com.wilutions.byps.test.api.BSerializer_1898022288.instance);
		bout.writeObj(obj.int1, false, com.wilutions.byps.test.api.BSerializer_1493282670.instance);
		bout.writeObj(obj.int2, false, com.wilutions.byps.test.api.BSerializer_1406124761.instance);
		bout.writeObj(obj.long1, false, com.wilutions.byps.test.api.BSerializer_1457164460.instance);
		bout.writeObj(obj.obj1, false, com.wilutions.byps.BSerializer_14.instance);
		bout.writeObj(obj.primitiveTypes1, false, com.wilutions.byps.test.api.BSerializer_1280571537.instance);
		bout.writeObj(obj.short1, false, com.wilutions.byps.test.api.BSerializer_2028443792.instance);
		bout.writeObj(obj.string1, false, com.wilutions.byps.test.api.BSerializer_1888799711.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final SetTypes obj = (SetTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new SetTypes()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean1 = (java.util.Set<java.lang.Boolean>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1365696060.instance);
		obj.byte1 = (java.util.HashSet<java.lang.Byte>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_31512998.instance);
		obj.byte2 = (java.util.Set<byte[]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2052431866.instance);
		obj.char1 = (java.util.TreeSet<java.lang.Character>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_936607009.instance);
		obj.double1 = (java.util.Set<java.lang.Double>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1320560671.instance);
		obj.float1 = (java.util.Set<java.lang.Float>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1898022288.instance);
		obj.int1 = (java.util.Set<java.lang.Integer>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1493282670.instance);
		obj.int2 = (java.util.Set<int[]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1406124761.instance);
		obj.long1 = (java.util.Set<java.lang.Long>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1457164460.instance);
		obj.obj1 = (java.util.Set<java.lang.Object>)bin.readObj(false, com.wilutions.byps.BSerializer_14.instance);
		obj.primitiveTypes1 = (java.util.Set<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1280571537.instance);
		obj.short1 = (java.util.Set<java.lang.Short>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2028443792.instance);
		obj.string1 = (java.util.Set<java.lang.String>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1888799711.instance);
		
		return obj;
	}
	
}

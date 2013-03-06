﻿package com.wilutions.byps.test.api.list;

/*
 * Serializer for com.wilutions.byps.test.api.list.ListTypes
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=14

@SuppressWarnings("all")
public class BSerializer_3001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_3001();
	
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
		       /* pos=48: int4 */ + 4		
		       /* pos=52: obj1 */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_3001() {
		super(3001);
	}
	
	public BSerializer_3001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final ListTypes obj = (ListTypes)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean1, false, com.wilutions.byps.test.api.BSerializer_1617670280.instance);
		bout.writeObj(obj.byte1, false, com.wilutions.byps.test.api.BSerializer_1059148284.instance);
		bout.writeObj(obj.byte2, false, com.wilutions.byps.test.api.BSerializer_1174971318.instance);
		bout.writeObj(obj.char1, false, com.wilutions.byps.test.api.BSerializer_1661807911.instance);
		bout.writeObj(obj.double1, false, com.wilutions.byps.test.api.BSerializer_1555345627.instance);
		bout.writeObj(obj.float1, false, com.wilutions.byps.test.api.BSerializer_1628501332.instance);
		bout.writeObj(obj.int1, false, com.wilutions.byps.test.api.BSerializer_181681714.instance);
		bout.writeObj(obj.int2, false, com.wilutions.byps.test.api.BSerializer_1752158699.instance);
		bout.writeObj(obj.int4, false, com.wilutions.byps.test.api.BSerializer_1088217157.instance);
		bout.writeObj(obj.long1, false, com.wilutions.byps.test.api.BSerializer_1050216688.instance);
		bout.writeObj(obj.obj1, false, com.wilutions.byps.BSerializer_12.instance);
		bout.writeObj(obj.primitiveTypes1, false, com.wilutions.byps.test.api.BSerializer_1544333227.instance);
		bout.writeObj(obj.short1, false, com.wilutions.byps.test.api.BSerializer_1997002548.instance);
		bout.writeObj(obj.string1, false, com.wilutions.byps.test.api.BSerializer_2123584667.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final ListTypes obj = (ListTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new ListTypes()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean1 = (java.util.List<java.lang.Boolean>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1617670280.instance);
		obj.byte1 = (java.util.List<java.lang.Byte>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1059148284.instance);
		obj.byte2 = (java.util.List<byte[]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1174971318.instance);
		obj.char1 = (java.util.List<java.lang.Character>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1661807911.instance);
		obj.double1 = (java.util.List<java.lang.Double>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1555345627.instance);
		obj.float1 = (java.util.List<java.lang.Float>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1628501332.instance);
		obj.int1 = (java.util.List<java.lang.Integer>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_181681714.instance);
		obj.int2 = (java.util.List<int[]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1752158699.instance);
		obj.int4 = (java.util.List<int[][][][]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1088217157.instance);
		obj.long1 = (java.util.List<java.lang.Long>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1050216688.instance);
		obj.obj1 = (java.util.List<java.lang.Object>)bin.readObj(false, com.wilutions.byps.BSerializer_12.instance);
		obj.primitiveTypes1 = (java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1544333227.instance);
		obj.short1 = (java.util.List<java.lang.Short>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1997002548.instance);
		obj.string1 = (java.util.List<java.lang.String>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2123584667.instance);
		
		return obj;
	}
	
}

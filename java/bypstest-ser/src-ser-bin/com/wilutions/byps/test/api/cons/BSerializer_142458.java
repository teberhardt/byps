﻿package com.wilutions.byps.test.api.cons;

/*
 * Serializer for com.wilutions.byps.test.api.cons.AllTypesZ
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
public class BSerializer_142458 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_142458();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: bool1 */ + 4		
		       /* pos=4: byte1 */ + 1		
		       /* padding */ + 1		
		       /* pos=6: char1 */ + 2		
		       /* pos=8: short1 */ + 2		
		       /* padding */ + 2		
		       /* pos=12: int1 */ + 4		
		       /* pos=16: long1 */ + 8		
		       /* pos=24: float1 */ + 4		
		       /* padding */ + 4		
		       /* pos=32: double1 */ + 8		
		       /* pos=40: string1 */ + 4		
		       /* pos=44: hebrew1 */ + 4		
		       /* pos=48: byte2 */ + 4		
		       /* pos=52: int2 */ + 4		
		       /* pos=56: string2 */ + 4		
		       /* pos=60: hebrew2 */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_142458() {
		super(142458);
	}
	
	public BSerializer_142458(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final AllTypesZ obj = (AllTypesZ)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putBoolean(obj.isBool1());
		bbuf.putByte(obj.getByte1());
		bbuf.putChar(obj.getChar1());
		bbuf.putDouble(obj.getDouble1());
		bbuf.putFloat(obj.getFloat1());
		bbuf.putInt(obj.getInt1());
		bbuf.putLong(obj.getLong1());
		bbuf.putShort(obj.getShort1());
		bbuf.putString(obj.getString1());
		bout.writeObj(obj.getByte2(), false, com.wilutions.byps.test.api.BSerializer_1374008726.instance);
		bout.writeObj(obj.getHebrew1(), false, null);
		bout.writeObj(obj.getHebrew2(), false, com.wilutions.byps.test.api.BSerializer_2092671091.instance);
		bout.writeObj(obj.getInt2(), false, com.wilutions.byps.test.api.BSerializer_100361105.instance);
		bout.writeObj(obj.getString2(), true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final AllTypesZ obj = (AllTypesZ)(obj1 != null ? obj1 : bin.onObjectCreated(new AllTypesZ()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.setBool1(bbuf.getBoolean());
		obj.setByte1(bbuf.getByte());
		obj.setChar1(bbuf.getChar());
		obj.setDouble1(bbuf.getDouble());
		obj.setFloat1(bbuf.getFloat());
		obj.setInt1(bbuf.getInt());
		obj.setLong1(bbuf.getLong());
		obj.setShort1(bbuf.getShort());
		obj.setString1(bbuf.getString());
		obj.setByte2((byte[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1374008726.instance));
		obj.setHebrew1((com.wilutions.byps.test.api.cons.HebrewZ)bin.readObj(false, null));
		obj.setHebrew2((com.wilutions.byps.test.api.cons.HebrewZ[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2092671091.instance));
		obj.setInt2((int[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_100361105.instance));
		obj.setString2((java.lang.String[])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1888107655.instance));
		
		return obj;
	}
	
}
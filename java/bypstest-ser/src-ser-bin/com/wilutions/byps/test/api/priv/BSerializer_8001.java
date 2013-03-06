﻿package com.wilutions.byps.test.api.priv;

/*
 * Serializer for com.wilutions.byps.test.api.priv.PrivateMembers
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=21

@SuppressWarnings("all")
public class BSerializer_8001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_8001();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: boolVal */ + 4		
		       /* pos=4: byteVal */ + 1		
		       /* padding */ + 1		
		       /* pos=6: charVal */ + 2		
		       /* pos=8: shortVal */ + 2		
		       /* padding */ + 2		
		       /* pos=12: intVal */ + 4		
		       /* pos=16: longVal */ + 8		
		       /* pos=24: floatVal */ + 4		
		       /* padding */ + 4		
		       /* pos=32: doubleVal */ + 8		
		       /* pos=40: stringVal */ + 4		
		       /* pos=44: primitiveTypes */ + 4		
		       /* pos=48: arrBool */ + 4		
		       /* pos=52: arrInt */ + 4		
		       /* pos=56: arrString */ + 4		
		       /* pos=60: arrPrimitiveTypes */ + 4		
		       /* pos=64: listBool */ + 4		
		       /* pos=68: listInt */ + 4		
		       /* pos=72: listString */ + 4		
		       /* pos=76: listPrimitiveTypes */ + 4		
		       /* pos=80: mapIntListString */ + 4		
		       /* pos=84: protInt */ + 4		
		       /* pos=88: pprotInt */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_8001() {
		super(8001);
	}
	
	public BSerializer_8001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final PrivateMembers obj = (PrivateMembers)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putBoolean(obj.isBoolVal());
		bbuf.putByte(obj.getByteVal());
		bbuf.putChar(obj.getCharVal());
		bbuf.putDouble(obj.getDoubleVal());
		bbuf.putFloat(obj.getFloatVal());
		bbuf.putInt(obj.getIntVal());
		bbuf.putLong(obj.getLongVal());
		bbuf.putInt(obj.pprotInt);
		bbuf.putInt(obj.protInt);
		bbuf.putShort(obj.getShortVal());
		bbuf.putString(obj.getStringVal());
		bout.writeObj(obj.getArrBool(), false, com.wilutions.byps.test.api.BSerializer_2058423690.instance);
		bout.writeObj(obj.getArrInt(), false, com.wilutions.byps.test.api.BSerializer_100361105.instance);
		bout.writeObj(obj.getArrPrimitiveTypes(), false, com.wilutions.byps.test.api.BSerializer_801243127.instance);
		bout.writeObj(obj.getArrString(), true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
		bout.writeObj(obj.getListBool(), false, com.wilutions.byps.test.api.BSerializer_1617670280.instance);
		bout.writeObj(obj.getListInt(), false, com.wilutions.byps.test.api.BSerializer_181681714.instance);
		bout.writeObj(obj.getListPrimitiveTypes(), false, com.wilutions.byps.test.api.BSerializer_1544333227.instance);
		bout.writeObj(obj.getListString(), false, com.wilutions.byps.test.api.BSerializer_2123584667.instance);
		bout.writeObj(obj.getMapIntListString(), false, com.wilutions.byps.test.api.BSerializer_132175071.instance);
		bout.writeObj(obj.getPrimitiveTypes(), false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final PrivateMembers obj = (PrivateMembers)(obj1 != null ? obj1 : bin.onObjectCreated(new PrivateMembers()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.setBoolVal(bbuf.getBoolean());
		obj.setByteVal(bbuf.getByte());
		obj.setCharVal(bbuf.getChar());
		obj.setDoubleVal(bbuf.getDouble());
		obj.setFloatVal(bbuf.getFloat());
		obj.setIntVal(bbuf.getInt());
		obj.setLongVal(bbuf.getLong());
		obj.pprotInt = bbuf.getInt();
		obj.protInt = bbuf.getInt();
		obj.setShortVal(bbuf.getShort());
		obj.setStringVal(bbuf.getString());
		obj.setArrBool((boolean[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2058423690.instance));
		obj.setArrInt((int[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_100361105.instance));
		obj.setArrPrimitiveTypes((com.wilutions.byps.test.api.prim.PrimitiveTypes[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_801243127.instance));
		obj.setArrString((java.lang.String[])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1888107655.instance));
		obj.setListBool((java.util.List<java.lang.Boolean>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1617670280.instance));
		obj.setListInt((java.util.List<java.lang.Integer>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_181681714.instance));
		obj.setListPrimitiveTypes((java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1544333227.instance));
		obj.setListString((java.util.List<java.lang.String>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2123584667.instance));
		obj.setMapIntListString((java.util.Map<java.lang.Integer,java.util.List<java.lang.String>>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_132175071.instance));
		obj.setPrimitiveTypes((com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj(false, null));
		
		return obj;
	}
	
}

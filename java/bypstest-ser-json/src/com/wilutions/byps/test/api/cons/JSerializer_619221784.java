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
public class JSerializer_619221784 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_619221784();
	
	
	public JSerializer_619221784() {
		super(619221784);
	}
	
	public JSerializer_619221784(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final AllTypesZ obj = (AllTypesZ)obj1;		
		bbuf.putBoolean("bool1", obj.isBool1());
		bbuf.putByte("byte1", obj.getByte1());
		bbuf.putChar("char1", obj.getChar1());
		bbuf.putDouble("double1", obj.getDouble1());
		bbuf.putFloat("float1", obj.getFloat1());
		bbuf.putInt("int1", obj.getInt1());
		bbuf.putLong("long1", obj.getLong1());
		bbuf.putShort("short1", obj.getShort1());
		bbuf.putString("string1", obj.getString1());
		bbuf.putArrayByte("byte2", obj.getByte2());
		bout.writeObj("hebrew1",obj.getHebrew1(), false, null);
		bout.writeObj("hebrew2",obj.getHebrew2(), false, com.wilutions.byps.test.api.JSerializer_2092671091.instance);
		bout.writeObj("int2",obj.getInt2(), false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("string2",obj.getString2(), true, com.wilutions.byps.test.api.JSerializer_1888107655.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final AllTypesZ obj = (AllTypesZ)(obj1 != null ? obj1 : bin.onObjectCreated(new AllTypesZ()));
		
		final BJsonObject js = bin.currentObject;
		obj.setBool1(js.getBoolean("bool1"));
		obj.setByte1(js.getByte("byte1"));
		obj.setChar1(js.getChar("char1"));
		obj.setDouble1(js.getDouble("double1"));
		obj.setFloat1(js.getFloat("float1"));
		obj.setInt1(js.getInt("int1"));
		obj.setLong1(js.getLong("long1"));
		obj.setShort1(js.getShort("short1"));
		obj.setString1(js.getString("string1"));
		obj.setByte2(js.getArrayByte("byte2"));
		obj.setHebrew1((com.wilutions.byps.test.api.cons.HebrewZ)bin.readObj("hebrew1", false, null));
		obj.setHebrew2((com.wilutions.byps.test.api.cons.HebrewZ[])bin.readObj("hebrew2", false, com.wilutions.byps.test.api.JSerializer_2092671091.instance));
		obj.setInt2((int[])bin.readObj("int2", false, com.wilutions.byps.test.api.JSerializer_100361105.instance));
		obj.setString2((java.lang.String[])bin.readObj("string2", true, com.wilutions.byps.test.api.JSerializer_1888107655.instance));
		
		return obj;
	}
	
}

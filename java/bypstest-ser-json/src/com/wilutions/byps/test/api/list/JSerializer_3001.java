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
public class JSerializer_3001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_3001();
	
	
	public JSerializer_3001() {
		super(3001);
	}
	
	public JSerializer_3001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final ListTypes obj = (ListTypes)obj1;		
		bout.writeObj("boolean1",obj.boolean1, false, com.wilutions.byps.test.api.JSerializer_1617670280.instance);
		bout.writeObj("byte1",obj.byte1, false, com.wilutions.byps.test.api.JSerializer_1059148284.instance);
		bout.writeObj("byte2",obj.byte2, false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
		bout.writeObj("char1",obj.char1, false, com.wilutions.byps.test.api.JSerializer_1661807911.instance);
		bout.writeObj("double1",obj.double1, false, com.wilutions.byps.test.api.JSerializer_1555345627.instance);
		bout.writeObj("float1",obj.float1, false, com.wilutions.byps.test.api.JSerializer_1628501332.instance);
		bout.writeObj("int1",obj.int1, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		bout.writeObj("int2",obj.int2, false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
		bout.writeObj("int4",obj.int4, false, com.wilutions.byps.test.api.JSerializer_1088217157.instance);
		bout.writeObj("long1",obj.long1, false, com.wilutions.byps.test.api.JSerializer_1050216688.instance);
		bout.writeObj("obj1",obj.obj1, false, com.wilutions.byps.JSerializer_12.instance);
		bout.writeObj("primitiveTypes1",obj.primitiveTypes1, false, com.wilutions.byps.test.api.JSerializer_1544333227.instance);
		bout.writeObj("short1",obj.short1, false, com.wilutions.byps.test.api.JSerializer_1997002548.instance);
		bout.writeObj("string1",obj.string1, false, com.wilutions.byps.test.api.JSerializer_2123584667.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final ListTypes obj = (ListTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new ListTypes()));
		
		final BJsonObject js = bin.currentObject;
		obj.boolean1 = (java.util.List<java.lang.Boolean>)bin.readObj("boolean1", false, com.wilutions.byps.test.api.JSerializer_1617670280.instance);
		obj.byte1 = (java.util.List<java.lang.Byte>)bin.readObj("byte1", false, com.wilutions.byps.test.api.JSerializer_1059148284.instance);
		obj.byte2 = (java.util.List<byte[]>)bin.readObj("byte2", false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
		obj.char1 = (java.util.List<java.lang.Character>)bin.readObj("char1", false, com.wilutions.byps.test.api.JSerializer_1661807911.instance);
		obj.double1 = (java.util.List<java.lang.Double>)bin.readObj("double1", false, com.wilutions.byps.test.api.JSerializer_1555345627.instance);
		obj.float1 = (java.util.List<java.lang.Float>)bin.readObj("float1", false, com.wilutions.byps.test.api.JSerializer_1628501332.instance);
		obj.int1 = (java.util.List<java.lang.Integer>)bin.readObj("int1", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		obj.int2 = (java.util.List<int[]>)bin.readObj("int2", false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
		obj.int4 = (java.util.List<int[][][][]>)bin.readObj("int4", false, com.wilutions.byps.test.api.JSerializer_1088217157.instance);
		obj.long1 = (java.util.List<java.lang.Long>)bin.readObj("long1", false, com.wilutions.byps.test.api.JSerializer_1050216688.instance);
		obj.obj1 = (java.util.List<java.lang.Object>)bin.readObj("obj1", false, com.wilutions.byps.JSerializer_12.instance);
		obj.primitiveTypes1 = (java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj("primitiveTypes1", false, com.wilutions.byps.test.api.JSerializer_1544333227.instance);
		obj.short1 = (java.util.List<java.lang.Short>)bin.readObj("short1", false, com.wilutions.byps.test.api.JSerializer_1997002548.instance);
		obj.string1 = (java.util.List<java.lang.String>)bin.readObj("string1", false, com.wilutions.byps.test.api.JSerializer_2123584667.instance);
		
		return obj;
	}
	
}

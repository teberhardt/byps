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
public class JSerializer_2001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2001();
	
	
	public JSerializer_2001() {
		super(2001);
	}
	
	public JSerializer_2001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final ArrayTypes1dim obj = (ArrayTypes1dim)obj1;		
		bout.writeObj("boolean1",obj.boolean1, false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		bbuf.putArrayByte("byte1", obj.byte1);
		bout.writeObj("char1",obj.char1, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		bout.writeObj("double1",obj.double1, false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		bout.writeObj("float1",obj.float1, false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		bout.writeObj("int1",obj.int1, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("long1",obj.long1, false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		bout.writeObj("primitiveTypes1",obj.primitiveTypes1, false, com.wilutions.byps.test.api.JSerializer_801243127.instance);
		bout.writeObj("short1",obj.short1, false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		bout.writeObj("string1",obj.string1, true, com.wilutions.byps.test.api.JSerializer_1888107655.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final ArrayTypes1dim obj = (ArrayTypes1dim)(obj1 != null ? obj1 : bin.onObjectCreated(new ArrayTypes1dim()));
		
		final BJsonObject js = bin.currentObject;
		obj.boolean1 = (boolean[])bin.readObj("boolean1", false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		obj.byte1 = js.getArrayByte("byte1");
		obj.char1 = (char[])bin.readObj("char1", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		obj.double1 = (double[])bin.readObj("double1", false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		obj.float1 = (float[])bin.readObj("float1", false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		obj.int1 = (int[])bin.readObj("int1", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		obj.long1 = (long[])bin.readObj("long1", false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		obj.primitiveTypes1 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[])bin.readObj("primitiveTypes1", false, com.wilutions.byps.test.api.JSerializer_801243127.instance);
		obj.short1 = (short[])bin.readObj("short1", false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		obj.string1 = (java.lang.String[])bin.readObj("string1", true, com.wilutions.byps.test.api.JSerializer_1888107655.instance);
		
		return obj;
	}
	
}

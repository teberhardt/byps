﻿package com.wilutions.byps.test.api.ver;

/*
 * Serializer for com.wilutions.byps.test.api.ver.Evolve
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=66

@SuppressWarnings("all")
public class JSerializer_1391985860 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1391985860();
	
	
	public JSerializer_1391985860() {
		super(1391985860);
	}
	
	public JSerializer_1391985860(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Evolve obj = (Evolve)obj1;		
		bbuf.putBoolean("bool1", obj.bool1);
		bbuf.putByte("byte1", obj.byte1);
		bbuf.putChar("char1", obj.char1);
		bbuf.putDouble("double1", obj.double1);
		bbuf.putFloat("float1", obj.float1);
		bbuf.putInt("int1", obj.int1);
		bbuf.putLong("long1", obj.long1);
		bbuf.putShort("short1", obj.short1);
		bbuf.putString("str1", obj.str1);
		bbuf.putBoolean("bool2", obj.bool2);
		bbuf.putByte("byte2", obj.byte2);
		bbuf.putChar("char2", obj.char2);
		bbuf.putDouble("double2", obj.double2);
		bbuf.putFloat("float2", obj.float2);
		bbuf.putInt("int2", obj.int2);
		bbuf.putLong("long2", obj.long2);
		bbuf.putShort("short2", obj.short2);
		bbuf.putString("str2", obj.str2);
		bbuf.putBoolean("bool3", obj.bool3);
		bbuf.putByte("byte3", obj.byte3);
		bbuf.putChar("char3", obj.char3);
		bbuf.putDouble("double3", obj.double3);
		bbuf.putFloat("float3", obj.float3);
		bbuf.putInt("int3", obj.int3);
		bbuf.putLong("long3", obj.long3);
		bbuf.putShort("short3", obj.short3);
		bbuf.putString("str3", obj.str3);
		bout.writeObj("bools1",obj.bools1, false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		bbuf.putArrayByte("bytes1", obj.bytes1);
		bout.writeObj("chars1",obj.chars1, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		bout.writeObj("doubles1",obj.doubles1, false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		bout.writeObj("evo1",obj.evo1, false, null);
		bout.writeObj("floats1",obj.floats1, false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		bout.writeObj("ints1",obj.ints1, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("list1",obj.list1, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		bout.writeObj("longs1",obj.longs1, false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		bout.writeObj("map1",obj.map1, false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		bout.writeObj("obj1",obj.obj1, false, null);
		bout.writeObj("set1",obj.set1, false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		bout.writeObj("shorts1",obj.shorts1, false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		bout.writeObj("bools2",obj.bools2, false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		bbuf.putArrayByte("bytes2", obj.bytes2);
		bout.writeObj("chars2",obj.chars2, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		bout.writeObj("doubles2",obj.doubles2, false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		bout.writeObj("evo2",obj.evo2, false, null);
		bout.writeObj("floats2",obj.floats2, false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		bout.writeObj("ints2",obj.ints2, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("list2",obj.list2, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		bout.writeObj("longs2",obj.longs2, false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		bout.writeObj("map2",obj.map2, false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		bout.writeObj("obj2",obj.obj2, false, null);
		bout.writeObj("set2",obj.set2, false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		bout.writeObj("shorts2",obj.shorts2, false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		bout.writeObj("bools3",obj.bools3, false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		bbuf.putArrayByte("bytes3", obj.bytes3);
		bout.writeObj("chars3",obj.chars3, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		bout.writeObj("doubles3",obj.doubles3, false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		bout.writeObj("evo3",obj.evo3, false, null);
		bout.writeObj("floats3",obj.floats3, false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		bout.writeObj("ints3",obj.ints3, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("list3",obj.list3, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		bout.writeObj("longs3",obj.longs3, false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		bout.writeObj("map3",obj.map3, false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		bout.writeObj("obj3",obj.obj3, false, null);
		bout.writeObj("set3",obj.set3, false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		bout.writeObj("shorts3",obj.shorts3, false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Evolve obj = (Evolve)(obj1 != null ? obj1 : bin.onObjectCreated(new Evolve()));
		
		final BJsonObject js = bin.currentObject;
		obj.bool1 = js.getBoolean("bool1");
		obj.byte1 = js.getByte("byte1");
		obj.char1 = js.getChar("char1");
		obj.double1 = js.getDouble("double1");
		obj.float1 = js.getFloat("float1");
		obj.int1 = js.getInt("int1");
		obj.long1 = js.getLong("long1");
		obj.short1 = js.getShort("short1");
		obj.str1 = js.getString("str1");
		obj.bool2 = js.getBoolean("bool2");
		obj.byte2 = js.getByte("byte2");
		obj.char2 = js.getChar("char2");
		obj.double2 = js.getDouble("double2");
		obj.float2 = js.getFloat("float2");
		obj.int2 = js.getInt("int2");
		obj.long2 = js.getLong("long2");
		obj.short2 = js.getShort("short2");
		obj.str2 = js.getString("str2");
		obj.bool3 = js.getBoolean("bool3");
		obj.byte3 = js.getByte("byte3");
		obj.char3 = js.getChar("char3");
		obj.double3 = js.getDouble("double3");
		obj.float3 = js.getFloat("float3");
		obj.int3 = js.getInt("int3");
		obj.long3 = js.getLong("long3");
		obj.short3 = js.getShort("short3");
		obj.str3 = js.getString("str3");
		obj.bools1 = (boolean[])bin.readObj("bools1", false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		obj.bytes1 = js.getArrayByte("bytes1");
		obj.chars1 = (char[])bin.readObj("chars1", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		obj.doubles1 = (double[])bin.readObj("doubles1", false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		obj.evo1 = (com.wilutions.byps.test.api.ver.Evolve2)bin.readObj("evo1", false, null);
		obj.floats1 = (float[])bin.readObj("floats1", false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		obj.ints1 = (int[])bin.readObj("ints1", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		obj.list1 = (java.util.List<java.lang.Integer>)bin.readObj("list1", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		obj.longs1 = (long[])bin.readObj("longs1", false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		obj.map1 = (java.util.Map<java.lang.Integer,java.lang.Integer>)bin.readObj("map1", false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		obj.obj1 = (java.lang.Object)bin.readObj("obj1", false, null);
		obj.set1 = (java.util.Set<java.lang.Integer>)bin.readObj("set1", false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		obj.shorts1 = (short[])bin.readObj("shorts1", false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		obj.bools2 = (boolean[])bin.readObj("bools2", false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		obj.bytes2 = js.getArrayByte("bytes2");
		obj.chars2 = (char[])bin.readObj("chars2", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		obj.doubles2 = (double[])bin.readObj("doubles2", false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		obj.evo2 = (com.wilutions.byps.test.api.ver.Evolve2)bin.readObj("evo2", false, null);
		obj.floats2 = (float[])bin.readObj("floats2", false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		obj.ints2 = (int[])bin.readObj("ints2", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		obj.list2 = (java.util.List<java.lang.Integer>)bin.readObj("list2", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		obj.longs2 = (long[])bin.readObj("longs2", false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		obj.map2 = (java.util.Map<java.lang.Integer,java.lang.Integer>)bin.readObj("map2", false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		obj.obj2 = (java.lang.Object)bin.readObj("obj2", false, null);
		obj.set2 = (java.util.Set<java.lang.Integer>)bin.readObj("set2", false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		obj.shorts2 = (short[])bin.readObj("shorts2", false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		obj.bools3 = (boolean[])bin.readObj("bools3", false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		obj.bytes3 = js.getArrayByte("bytes3");
		obj.chars3 = (char[])bin.readObj("chars3", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		obj.doubles3 = (double[])bin.readObj("doubles3", false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		obj.evo3 = (com.wilutions.byps.test.api.ver.Evolve2)bin.readObj("evo3", false, null);
		obj.floats3 = (float[])bin.readObj("floats3", false, com.wilutions.byps.test.api.JSerializer_766441794.instance);
		obj.ints3 = (int[])bin.readObj("ints3", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		obj.list3 = (java.util.List<java.lang.Integer>)bin.readObj("list3", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		obj.longs3 = (long[])bin.readObj("longs3", false, com.wilutions.byps.test.api.JSerializer_1097129250.instance);
		obj.map3 = (java.util.Map<java.lang.Integer,java.lang.Integer>)bin.readObj("map3", false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		obj.obj3 = (java.lang.Object)bin.readObj("obj3", false, null);
		obj.set3 = (java.util.Set<java.lang.Integer>)bin.readObj("set3", false, com.wilutions.byps.test.api.JSerializer_1493282670.instance);
		obj.shorts3 = (short[])bin.readObj("shorts3", false, com.wilutions.byps.test.api.JSerializer_2067161310.instance);
		
		return obj;
	}
	
}

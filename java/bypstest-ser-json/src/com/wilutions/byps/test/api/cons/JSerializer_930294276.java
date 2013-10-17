package com.wilutions.byps.test.api.cons;

/*
 * Serializer for com.wilutions.byps.test.api.cons.AllTypesC
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=18

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_930294276 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_930294276();
	
	public JSerializer_930294276() {
		super(930294276);
	}
	
	public JSerializer_930294276(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final AllTypesC obj = (AllTypesC)obj1;		
		bbuf.putBoolean("bool1s", obj.bool1s);
		bbuf.putBoolean("bool2s", obj.bool2s);
		bbuf.putByte("byte1s", obj.byte1s);
		bbuf.putChar("char1s", obj.char1s);
		bbuf.putChar("char2s", obj.char2s);
		bbuf.putDouble("double1s", obj.double1s);
		bbuf.putFloat("float1s", obj.float1s);
		bbuf.putInt("int1s", obj.int1s);
		bbuf.putLong("long1s", obj.long1s);
		bbuf.putShort("short1s", obj.short1s);
		bbuf.putString("string1s", obj.string1s);
		bbuf.putString("stringNull", obj.stringNull);
		bout.writeObj("ALL",obj.ALL, false, null);
		bout.writeObj("arrALL",obj.arrALL, false, com.wilutions.byps.test.api.JSerializer_1981543076.instance);
		bout.writeObj("arrInt",obj.arrInt, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("arrInt4",obj.arrInt4, false, com.wilutions.byps.test.api.JSerializer_39910537.instance);
		bout.writeObj("arrStrings",obj.arrStrings, true, com.wilutions.byps.test.api.JSerializer_1888107655.instance);
		bout.writeObj("arrStrings4",obj.arrStrings4, true, com.wilutions.byps.test.api.JSerializer_588723219.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final AllTypesC obj = (AllTypesC)(obj1 != null ? obj1 : bin.onObjectCreated(new AllTypesC()));
		
		final BJsonObject js = bin.currentObject;
		
		return obj;
	}
	
}

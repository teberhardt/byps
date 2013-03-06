﻿package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.Class2
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_6002 extends JSerializer_6001 {
	
	public final static BSerializer instance = new JSerializer_6002();
	
	
	public JSerializer_6002() {
		super(6002);
	}
	
	public JSerializer_6002(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Class2 obj = (Class2)obj1;		
		super.internalWrite(obj1, bout, bbuf);		
		bbuf.putInt("int2", obj.int2);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Class2 obj = (Class2)(obj1 != null ? obj1 : bin.onObjectCreated(new Class2()));
		
		// Read base class members
		super.internalRead(obj1, bin);
		
		final BJsonObject js = bin.currentObject;
		obj.int2 = js.getInt("int2");
		
		return obj;
	}
	
}

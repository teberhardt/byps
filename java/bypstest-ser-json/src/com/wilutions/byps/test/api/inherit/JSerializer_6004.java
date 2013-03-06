﻿package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.Class1Collections
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=3

@SuppressWarnings("all")
public class JSerializer_6004 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_6004();
	
	
	public JSerializer_6004() {
		super(6004);
	}
	
	public JSerializer_6004(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Class1Collections obj = (Class1Collections)obj1;		
		bout.writeObj("list1",obj.list1, false, com.wilutions.byps.test.api.JSerializer_317887457.instance);
		bout.writeObj("map1",obj.map1, false, com.wilutions.byps.test.api.JSerializer_981592984.instance);
		bout.writeObj("set1",obj.set1, false, com.wilutions.byps.test.api.JSerializer_2114305573.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Class1Collections obj = (Class1Collections)(obj1 != null ? obj1 : bin.onObjectCreated(new Class1Collections()));
		
		final BJsonObject js = bin.currentObject;
		obj.list1 = (java.util.List<com.wilutions.byps.test.api.inherit.Class1>)bin.readObj("list1", false, com.wilutions.byps.test.api.JSerializer_317887457.instance);
		obj.map1 = (java.util.Map<java.lang.String,com.wilutions.byps.test.api.inherit.Class1>)bin.readObj("map1", false, com.wilutions.byps.test.api.JSerializer_981592984.instance);
		obj.set1 = (java.util.Set<com.wilutions.byps.test.api.inherit.Class1>)bin.readObj("set1", false, com.wilutions.byps.test.api.JSerializer_2114305573.instance);
		
		return obj;
	}
	
}

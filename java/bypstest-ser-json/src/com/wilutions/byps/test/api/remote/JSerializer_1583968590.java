﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteSetTypes_setFloat1
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_1583968590 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1583968590();
	
	
	public JSerializer_1583968590() {
		super(1583968590);
	}
	
	public JSerializer_1583968590(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteSetTypes_setFloat1 obj = (BRequest_RemoteSetTypes_setFloat1)obj1;		
		bout.writeObj("float1",obj.float1, false, com.wilutions.byps.test.api.JSerializer_1898022288.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_setFloat1 obj = (BRequest_RemoteSetTypes_setFloat1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setFloat1()));
		
		final BJsonObject js = bin.currentObject;
		obj.float1 = (java.util.Set<java.lang.Float>)bin.readObj("float1", false, com.wilutions.byps.test.api.JSerializer_1898022288.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteSetTypes_setBoolean1
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
public class JSerializer_1779393754 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1779393754();
	
	
	public JSerializer_1779393754() {
		super(1779393754);
	}
	
	public JSerializer_1779393754(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteSetTypes_setBoolean1 obj = (BRequest_RemoteSetTypes_setBoolean1)obj1;		
		bout.writeObj("boolean1",obj.boolean1, false, com.wilutions.byps.test.api.JSerializer_1365696060.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_setBoolean1 obj = (BRequest_RemoteSetTypes_setBoolean1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setBoolean1()));
		
		final BJsonObject js = bin.currentObject;
		obj.boolean1 = (java.util.Set<java.lang.Boolean>)bin.readObj("boolean1", false, com.wilutions.byps.test.api.JSerializer_1365696060.instance);
		
		return obj;
	}
	
}

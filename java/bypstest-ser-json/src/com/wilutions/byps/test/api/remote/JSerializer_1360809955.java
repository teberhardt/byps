﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_setInt1
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
public class JSerializer_1360809955 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1360809955();
	
	
	public JSerializer_1360809955() {
		super(1360809955);
	}
	
	public JSerializer_1360809955(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setInt1 obj = (BRequest_RemoteListTypes_setInt1)obj1;		
		bout.writeObj("int1",obj.int1, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setInt1 obj = (BRequest_RemoteListTypes_setInt1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setInt1()));
		
		final BJsonObject js = bin.currentObject;
		obj.int1 = (java.util.List<java.lang.Integer>)bin.readObj("int1", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		
		return obj;
	}
	
}

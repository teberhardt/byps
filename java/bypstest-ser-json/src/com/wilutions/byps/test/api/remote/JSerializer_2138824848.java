﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_setFloat1
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
public class JSerializer_2138824848 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2138824848();
	
	
	public JSerializer_2138824848() {
		super(2138824848);
	}
	
	public JSerializer_2138824848(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setFloat1 obj = (BRequest_RemoteListTypes_setFloat1)obj1;		
		bout.writeObj("float1",obj.float1, false, com.wilutions.byps.test.api.JSerializer_1628501332.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setFloat1 obj = (BRequest_RemoteListTypes_setFloat1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setFloat1()));
		
		final BJsonObject js = bin.currentObject;
		obj.float1 = (java.util.List<java.lang.Float>)bin.readObj("float1", false, com.wilutions.byps.test.api.JSerializer_1628501332.instance);
		
		return obj;
	}
	
}

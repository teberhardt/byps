﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_setInt4
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
public class JSerializer_1360809952 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1360809952();
	
	
	public JSerializer_1360809952() {
		super(1360809952);
	}
	
	public JSerializer_1360809952(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setInt4 obj = (BRequest_RemoteListTypes_setInt4)obj1;		
		bout.writeObj("int4",obj.int4, false, com.wilutions.byps.test.api.JSerializer_1633500852.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setInt4 obj = (BRequest_RemoteListTypes_setInt4)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setInt4()));
		
		final BJsonObject js = bin.currentObject;
		obj.int4 = (java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>>)bin.readObj("int4", false, com.wilutions.byps.test.api.JSerializer_1633500852.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_setInt2
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
public class JSerializer_1360809954 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1360809954();
	
	
	public JSerializer_1360809954() {
		super(1360809954);
	}
	
	public JSerializer_1360809954(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setInt2 obj = (BRequest_RemoteListTypes_setInt2)obj1;		
		bout.writeObj("int2",obj.int2, false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setInt2 obj = (BRequest_RemoteListTypes_setInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setInt2()));
		
		final BJsonObject js = bin.currentObject;
		obj.int2 = (java.util.List<int[]>)bin.readObj("int2", false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
		
		return obj;
	}
	
}

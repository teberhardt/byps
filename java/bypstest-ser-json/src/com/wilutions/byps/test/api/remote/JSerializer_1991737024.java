﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteSetTypes_setInt2
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
public class JSerializer_1991737024 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1991737024();
	
	
	public JSerializer_1991737024() {
		super(1991737024);
	}
	
	public JSerializer_1991737024(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteSetTypes_setInt2 obj = (BRequest_RemoteSetTypes_setInt2)obj1;		
		bout.writeObj("int2",obj.int2, false, com.wilutions.byps.test.api.JSerializer_1406124761.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_setInt2 obj = (BRequest_RemoteSetTypes_setInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setInt2()));
		
		final BJsonObject js = bin.currentObject;
		obj.int2 = (java.util.Set<int[]>)bin.readObj("int2", false, com.wilutions.byps.test.api.JSerializer_1406124761.instance);
		
		return obj;
	}
	
}

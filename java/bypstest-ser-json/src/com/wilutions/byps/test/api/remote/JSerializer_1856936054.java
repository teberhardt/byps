﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_voidFunctionVoid
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

@SuppressWarnings("all")
public class JSerializer_1856936054 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1856936054();
	
	
	public JSerializer_1856936054() {
		super(1856936054);
	}
	
	public JSerializer_1856936054(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_voidFunctionVoid obj = (BRequest_RemotePrimitiveTypes_voidFunctionVoid)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_voidFunctionVoid()));
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getDouble
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
public class JSerializer_581586209 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_581586209();
	
	
	public JSerializer_581586209() {
		super(581586209);
	}
	
	public JSerializer_581586209(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_getDouble obj = (BRequest_RemoteArrayTypes4dim_getDouble)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_getDouble()));
		
		return obj;
	}
	
}

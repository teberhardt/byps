﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setDouble
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
public class JSerializer_720472590 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_720472590();
	
	
	public JSerializer_720472590() {
		super(720472590);
	}
	
	public JSerializer_720472590(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes1dim_setDouble obj = (BRequest_RemoteArrayTypes1dim_setDouble)obj1;		
		bout.writeObj("v",obj.v, false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_setDouble obj = (BRequest_RemoteArrayTypes1dim_setDouble)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setDouble()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (double[])bin.readObj("v", false, com.wilutions.byps.test.api.JSerializer_1359468275.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setInt
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
public class JSerializer_1265927470 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1265927470();
	
	
	public JSerializer_1265927470() {
		super(1265927470);
	}
	
	public JSerializer_1265927470(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes1dim_setInt obj = (BRequest_RemoteArrayTypes1dim_setInt)obj1;		
		bout.writeObj("v",obj.v, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_setInt obj = (BRequest_RemoteArrayTypes1dim_setInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setInt()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (int[])bin.readObj("v", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		
		return obj;
	}
	
}

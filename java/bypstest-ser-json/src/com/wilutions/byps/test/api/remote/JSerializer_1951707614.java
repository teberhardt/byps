﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setShort
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
public class JSerializer_1951707614 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1951707614();
	
	
	public JSerializer_1951707614() {
		super(1951707614);
	}
	
	public JSerializer_1951707614(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setShort obj = (BRequest_RemoteArrayTypes4dim_setShort)obj1;		
		bout.writeObj("v",obj.v, false, com.wilutions.byps.test.api.JSerializer_1859644668.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setShort obj = (BRequest_RemoteArrayTypes4dim_setShort)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setShort()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (short[][][][])bin.readObj("v", false, com.wilutions.byps.test.api.JSerializer_1859644668.instance);
		
		return obj;
	}
	
}

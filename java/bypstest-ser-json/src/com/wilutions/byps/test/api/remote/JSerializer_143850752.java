﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setByte
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
public class JSerializer_143850752 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_143850752();
	
	
	public JSerializer_143850752() {
		super(143850752);
	}
	
	public JSerializer_143850752(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)obj1;		
		bbuf.putByte("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setByte()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getByte("v");
		
		return obj;
	}
	
}

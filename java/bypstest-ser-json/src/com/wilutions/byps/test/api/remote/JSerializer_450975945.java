﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setObject
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
public class JSerializer_450975945 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_450975945();
	
	
	public JSerializer_450975945() {
		super(450975945);
	}
	
	public JSerializer_450975945(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)obj1;		
		bout.writeObj("v",obj.v, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setObject()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (java.lang.Object)bin.readObj("v", false, null);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setLong
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
public class JSerializer_143562636 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_143562636();
	
	
	public JSerializer_143562636() {
		super(143562636);
	}
	
	public JSerializer_143562636(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setLong obj = (BRequest_RemotePrimitiveTypes_setLong)obj1;		
		bbuf.putLong("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setLong obj = (BRequest_RemotePrimitiveTypes_setLong)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setLong()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getLong("v");
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setFloat
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
public class JSerializer_161104028 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_161104028();
	
	
	public JSerializer_161104028() {
		super(161104028);
	}
	
	public JSerializer_161104028(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setFloat obj = (BRequest_RemotePrimitiveTypes_setFloat)obj1;		
		bbuf.putFloat("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setFloat obj = (BRequest_RemotePrimitiveTypes_setFloat)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setFloat()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getFloat("v");
		
		return obj;
	}
	
}

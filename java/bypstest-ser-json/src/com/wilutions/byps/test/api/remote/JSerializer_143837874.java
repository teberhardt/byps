﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setChar
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
public class JSerializer_143837874 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_143837874();
	
	
	public JSerializer_143837874() {
		super(143837874);
	}
	
	public JSerializer_143837874(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setChar obj = (BRequest_RemotePrimitiveTypes_setChar)obj1;		
		bbuf.putChar("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setChar obj = (BRequest_RemotePrimitiveTypes_setChar)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setChar()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getChar("v");
		
		return obj;
	}
	
}

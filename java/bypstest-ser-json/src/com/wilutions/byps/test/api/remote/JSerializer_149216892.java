﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setShort
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
public class JSerializer_149216892 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_149216892();
	
	
	public JSerializer_149216892() {
		super(149216892);
	}
	
	public JSerializer_149216892(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setShort obj = (BRequest_RemotePrimitiveTypes_setShort)obj1;		
		bbuf.putShort("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setShort obj = (BRequest_RemotePrimitiveTypes_setShort)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setShort()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getShort("v");
		
		return obj;
	}
	
}

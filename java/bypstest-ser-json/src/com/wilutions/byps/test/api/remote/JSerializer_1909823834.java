﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteMapTypes_setByte1
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
public class JSerializer_1909823834 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1909823834();
	
	
	public JSerializer_1909823834() {
		super(1909823834);
	}
	
	public JSerializer_1909823834(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setByte1 obj = (BRequest_RemoteMapTypes_setByte1)obj1;		
		bout.writeObj("byte1",obj.byte1, false, com.wilutions.byps.test.api.JSerializer_1972793385.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setByte1 obj = (BRequest_RemoteMapTypes_setByte1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setByte1()));
		
		final BJsonObject js = bin.currentObject;
		obj.byte1 = (java.util.HashMap<java.lang.Double,java.lang.Byte>)bin.readObj("byte1", false, com.wilutions.byps.test.api.JSerializer_1972793385.instance);
		
		return obj;
	}
	
}

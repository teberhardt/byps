﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteMapTypes_setByte2
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
public class JSerializer_1909823833 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1909823833();
	
	
	public JSerializer_1909823833() {
		super(1909823833);
	}
	
	public JSerializer_1909823833(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setByte2 obj = (BRequest_RemoteMapTypes_setByte2)obj1;		
		bout.writeObj("byte2",obj.byte2, false, com.wilutions.byps.test.api.JSerializer_1799280818.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setByte2 obj = (BRequest_RemoteMapTypes_setByte2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setByte2()));
		
		final BJsonObject js = bin.currentObject;
		obj.byte2 = (java.util.Map<java.lang.Integer,byte[]>)bin.readObj("byte2", false, com.wilutions.byps.test.api.JSerializer_1799280818.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_putStreamsOnClient
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
public class JSerializer_1367013829 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1367013829();
	
	
	public JSerializer_1367013829() {
		super(1367013829);
	}
	
	public JSerializer_1367013829(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ServerIF_putStreamsOnClient obj = (BRequest_ServerIF_putStreamsOnClient)obj1;		
		bout.writeObj("streams",obj.streams, false, com.wilutions.byps.test.api.JSerializer_1218831438.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ServerIF_putStreamsOnClient obj = (BRequest_ServerIF_putStreamsOnClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_putStreamsOnClient()));
		
		final BJsonObject js = bin.currentObject;
		obj.streams = (java.util.List<java.io.InputStream>)bin.readObj("streams", false, com.wilutions.byps.test.api.JSerializer_1218831438.instance);
		
		return obj;
	}
	
}

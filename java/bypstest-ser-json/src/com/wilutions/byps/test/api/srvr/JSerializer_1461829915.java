﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ClientIF_incrementInt
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
public class JSerializer_1461829915 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1461829915();
	
	
	public JSerializer_1461829915() {
		super(1461829915);
	}
	
	public JSerializer_1461829915(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ClientIF_incrementInt obj = (BRequest_ClientIF_incrementInt)obj1;		
		bbuf.putInt("a", obj.a);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ClientIF_incrementInt obj = (BRequest_ClientIF_incrementInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ClientIF_incrementInt()));
		
		final BJsonObject js = bin.currentObject;
		obj.a = js.getInt("a");
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ClientIF_getStreams
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
public class JSerializer_865920738 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_865920738();
	
	
	public JSerializer_865920738() {
		super(865920738);
	}
	
	public JSerializer_865920738(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ClientIF_getStreams obj = (BRequest_ClientIF_getStreams)obj1;		
		bbuf.putInt("ctrl", obj.ctrl);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ClientIF_getStreams obj = (BRequest_ClientIF_getStreams)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ClientIF_getStreams()));
		
		final BJsonObject js = bin.currentObject;
		obj.ctrl = js.getInt("ctrl");
		
		return obj;
	}
	
}

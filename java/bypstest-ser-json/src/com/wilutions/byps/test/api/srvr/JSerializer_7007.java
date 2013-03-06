﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.ChatStructure
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=3

@SuppressWarnings("all")
public class JSerializer_7007 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_7007();
	
	
	public JSerializer_7007() {
		super(7007);
	}
	
	public JSerializer_7007(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final ChatStructure obj = (ChatStructure)obj1;		
		bbuf.putString("msg", obj.msg);
		bbuf.putDouble("receivedAt", obj.receivedAt);
		bbuf.putDouble("sentAt", obj.sentAt);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final ChatStructure obj = (ChatStructure)(obj1 != null ? obj1 : bin.onObjectCreated(new ChatStructure()));
		
		final BJsonObject js = bin.currentObject;
		obj.msg = js.getString("msg");
		obj.receivedAt = js.getDouble("receivedAt");
		obj.sentAt = js.getDouble("sentAt");
		
		return obj;
	}
	
}

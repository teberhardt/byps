﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteServerCtrl_getPublishedRemote
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
public class JSerializer_1216543212 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1216543212();
	
	
	public JSerializer_1216543212() {
		super(1216543212);
	}
	
	public JSerializer_1216543212(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteServerCtrl_getPublishedRemote obj = (BRequest_RemoteServerCtrl_getPublishedRemote)obj1;		
		bbuf.putString("name", obj.name);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteServerCtrl_getPublishedRemote obj = (BRequest_RemoteServerCtrl_getPublishedRemote)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteServerCtrl_getPublishedRemote()));
		
		final BJsonObject js = bin.currentObject;
		obj.name = js.getString("name");
		
		return obj;
	}
	
}
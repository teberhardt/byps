﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteReferences_setNode
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
public class JSerializer_1404172848 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1404172848();
	
	
	public JSerializer_1404172848() {
		super(1404172848);
	}
	
	public JSerializer_1404172848(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteReferences_setNode obj = (BRequest_RemoteReferences_setNode)obj1;		
		bout.writeObj("v",obj.v, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteReferences_setNode obj = (BRequest_RemoteReferences_setNode)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteReferences_setNode()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (com.wilutions.byps.test.api.refs.Node)bin.readObj("v", false, null);
		
		return obj;
	}
	
}

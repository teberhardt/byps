﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteReferences_getNode
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

@SuppressWarnings("all")
public class JSerializer_655936732 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_655936732();
	
	
	public JSerializer_655936732() {
		super(655936732);
	}
	
	public JSerializer_655936732(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteReferences_getNode obj = (BRequest_RemoteReferences_getNode)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteReferences_getNode()));
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteStreams_getImages
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
public class JSerializer_1158979935 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1158979935();
	
	
	public JSerializer_1158979935() {
		super(1158979935);
	}
	
	public JSerializer_1158979935(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteStreams_getImages obj = (BRequest_RemoteStreams_getImages)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_getImages()));
		
		return obj;
	}
	
}

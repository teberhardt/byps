﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteStreams_getImage
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
public class BSerializer_1902276204 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1902276204();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_1902276204() {
		super(1902276204);
	}
	
	public BSerializer_1902276204(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteStreams_getImage obj = (BRequest_RemoteStreams_getImage)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_getImage()));
		
		return obj;
	}
	
}

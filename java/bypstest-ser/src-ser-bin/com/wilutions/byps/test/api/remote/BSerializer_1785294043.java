﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_setUseAuthentication
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1785294043 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1785294043();
	
	public BSerializer_1785294043() {
		super(1785294043);
	}
	
	public BSerializer_1785294043(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteWithAuthentication_setUseAuthentication obj = (BRequest_RemoteWithAuthentication_setUseAuthentication)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putBoolean(obj.useAuth);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteWithAuthentication_setUseAuthentication obj = (BRequest_RemoteWithAuthentication_setUseAuthentication)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_setUseAuthentication()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.useAuth = bbuf.getBoolean();
		
		return obj;
	}
	
}
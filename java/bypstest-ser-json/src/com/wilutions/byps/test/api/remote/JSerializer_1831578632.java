﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteStreams_setImage
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
public class JSerializer_1831578632 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1831578632();
	
	
	public JSerializer_1831578632() {
		super(1831578632);
	}
	
	public JSerializer_1831578632(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteStreams_setImage obj = (BRequest_RemoteStreams_setImage)obj1;		
		bout.writeObj("istrm",obj.istrm, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteStreams_setImage obj = (BRequest_RemoteStreams_setImage)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_setImage()));
		
		final BJsonObject js = bin.currentObject;
		obj.istrm = (java.io.InputStream)bin.readObj("istrm", false, null);
		
		return obj;
	}
	
}

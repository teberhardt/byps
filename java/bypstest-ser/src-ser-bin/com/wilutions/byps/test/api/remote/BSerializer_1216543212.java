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
public class BSerializer_1216543212 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1216543212();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: name */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1216543212() {
		super(1216543212);
	}
	
	public BSerializer_1216543212(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteServerCtrl_getPublishedRemote obj = (BRequest_RemoteServerCtrl_getPublishedRemote)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.name);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteServerCtrl_getPublishedRemote obj = (BRequest_RemoteServerCtrl_getPublishedRemote)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteServerCtrl_getPublishedRemote()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.name = bbuf.getString();
		
		return obj;
	}
	
}
﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BResult_RemotePrimitiveTypes_sendAllTypes
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
public class BSerializer_942211602 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_942211602();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: result */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_942211602() {
		super(942211602);
	}
	
	public BSerializer_942211602(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_RemotePrimitiveTypes_sendAllTypes obj = (BResult_RemotePrimitiveTypes_sendAllTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_RemotePrimitiveTypes_sendAllTypes()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		// void result		
		return obj;
	}
	
}

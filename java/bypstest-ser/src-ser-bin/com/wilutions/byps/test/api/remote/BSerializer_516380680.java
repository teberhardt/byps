﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BResult_RemoteSetTypes_setInt2
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
public class BSerializer_516380680 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_516380680();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: result */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_516380680() {
		super(516380680);
	}
	
	public BSerializer_516380680(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_RemoteSetTypes_setInt2 obj = (BResult_RemoteSetTypes_setInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_RemoteSetTypes_setInt2()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		// void result		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setShort
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
public class BSerializer_149216892 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_149216892();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: v */ + 2		
		       /* padding up to multiple of alignment */ + 6;		
	}
	
	public BSerializer_149216892() {
		super(149216892);
	}
	
	public BSerializer_149216892(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemotePrimitiveTypes_setShort obj = (BRequest_RemotePrimitiveTypes_setShort)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putShort(obj.v);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemotePrimitiveTypes_setShort obj = (BRequest_RemotePrimitiveTypes_setShort)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setShort()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = bbuf.getShort();
		
		return obj;
	}
	
}

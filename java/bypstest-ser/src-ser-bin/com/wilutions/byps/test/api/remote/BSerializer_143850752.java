﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setByte
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
public class BSerializer_143850752 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_143850752();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: v */ + 1		
		       /* padding up to multiple of alignment */ + 7;		
	}
	
	public BSerializer_143850752() {
		super(143850752);
	}
	
	public BSerializer_143850752(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putByte(obj.v);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setByte()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = bbuf.getByte();
		
		return obj;
	}
	
}

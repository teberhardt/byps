﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_callClientIncrementInt
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
public class BSerializer_1252575894 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1252575894();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: v */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1252575894() {
		super(1252575894);
	}
	
	public BSerializer_1252575894(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_ServerIF_callClientIncrementInt obj = (BRequest_ServerIF_callClientIncrementInt)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.v);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_ServerIF_callClientIncrementInt obj = (BRequest_ServerIF_callClientIncrementInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_callClientIncrementInt()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = bbuf.getInt();
		
		return obj;
	}
	
}

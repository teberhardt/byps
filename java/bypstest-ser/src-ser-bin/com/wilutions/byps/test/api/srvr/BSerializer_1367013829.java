﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_putStreamsOnClient
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
public class BSerializer_1367013829 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1367013829();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: streams */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1367013829() {
		super(1367013829);
	}
	
	public BSerializer_1367013829(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_ServerIF_putStreamsOnClient obj = (BRequest_ServerIF_putStreamsOnClient)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.streams, false, com.wilutions.byps.test.api.BSerializer_1218831438.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_ServerIF_putStreamsOnClient obj = (BRequest_ServerIF_putStreamsOnClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_putStreamsOnClient()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.streams = (java.util.List<java.io.InputStream>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1218831438.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_getClientIds
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
public class BSerializer_2063368540 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2063368540();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_2063368540() {
		super(2063368540);
	}
	
	public BSerializer_2063368540(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_ServerIF_getClientIds obj = (BRequest_ServerIF_getClientIds)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_getClientIds()));
		
		return obj;
	}
	
}

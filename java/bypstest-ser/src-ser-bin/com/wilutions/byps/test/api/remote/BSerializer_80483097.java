﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteMapTypes
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_80483097 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_80483097();
	
	public BSerializer_80483097() {
		super(80483097);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteMapTypes(transport);
	}
	
}

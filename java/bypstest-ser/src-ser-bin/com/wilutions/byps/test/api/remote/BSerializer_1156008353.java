﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteSetTypes
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1156008353 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1156008353();
	
	public BSerializer_1156008353() {
		super(1156008353);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteSetTypes(transport);
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteArrayTypes4dim
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1557173854 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1557173854();
	
	public BSerializer_1557173854() {
		super(1557173854);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteArrayTypes4dim(transport);
	}
	
}

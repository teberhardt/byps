﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteServerCtrl
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1124545992 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1124545992();
	
	public BSerializer_1124545992() {
		super(1124545992);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteServerCtrl(transport);
	}
	
}
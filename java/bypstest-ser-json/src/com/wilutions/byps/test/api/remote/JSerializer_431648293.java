﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteConstants
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_431648293 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_431648293();
	
	public JSerializer_431648293() {
		super(431648293);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteConstants(transport);
	}
	
}
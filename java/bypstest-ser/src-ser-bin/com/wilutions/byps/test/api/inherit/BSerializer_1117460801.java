package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BStub_PlantService
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1117460801 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1117460801();
	
	public BSerializer_1117460801() {
		super(1117460801);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_PlantService(transport);
	}
	
}

package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteInlineInstance
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1206670536 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1206670536();
	
	public BSerializer_1206670536() {
		super(1206670536);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteInlineInstance(transport);
	}
	
}

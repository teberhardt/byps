package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BStub_BioLemonService
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1992245333 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_1992245333();
	
	public JSerializer_1992245333() {
		super(1992245333);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_BioLemonService(transport);
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteEnums_getPlanet
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
public class JSerializer_627010462 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_627010462();
	
	
	public JSerializer_627010462() {
		super(627010462);
	}
	
	public JSerializer_627010462(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteEnums_getPlanet obj = (BRequest_RemoteEnums_getPlanet)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteEnums_getPlanet()));
		
		return obj;
	}
	
}

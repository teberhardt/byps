﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BResult_ServerIF_registerWithClientMap
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_227959465 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_227959465();
	
	
	public JSerializer_227959465() {
		super(227959465);
	}
	
	public JSerializer_227959465(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_ServerIF_registerWithClientMap obj = (BResult_ServerIF_registerWithClientMap)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_ServerIF_registerWithClientMap()));
		
		final BJsonObject js = bin.currentObject;
		// void result		
		return obj;
	}
	
}

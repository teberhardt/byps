﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1361632968
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
public class JSerializer_514676842 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_514676842();
	
	
	public JSerializer_514676842() {
		super(514676842);
	}
	
	public JSerializer_514676842(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1361632968 obj = (BResult_1361632968)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1361632968 obj = (BResult_1361632968)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1361632968()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (char[])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		
		return obj;
	}
	
}
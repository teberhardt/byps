﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1463615848
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
public class JSerializer_548882635 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_548882635();
	
	
	public JSerializer_548882635() {
		super(548882635);
	}
	
	public JSerializer_548882635(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1463615848 obj = (BResult_1463615848)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1463615848.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1463615848 obj = (BResult_1463615848)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1463615848()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1463615848.instance);
		
		return obj;
	}
	
}
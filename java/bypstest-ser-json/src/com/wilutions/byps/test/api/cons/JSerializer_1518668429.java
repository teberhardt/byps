﻿package com.wilutions.byps.test.api.cons;

/*
 * Serializer for com.wilutions.byps.test.api.cons.HebrewZ
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_1518668429 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1518668429();
	
	
	public JSerializer_1518668429() {
		super(1518668429);
	}
	
	public JSerializer_1518668429(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final HebrewZ obj = (HebrewZ)obj1;		
		bbuf.putString("core", obj.getCore());
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final HebrewZ obj = (HebrewZ)(obj1 != null ? obj1 : bin.onObjectCreated(new HebrewZ()));
		
		final BJsonObject js = bin.currentObject;
		obj.setCore(js.getString("core"));
		
		return obj;
	}
	
}

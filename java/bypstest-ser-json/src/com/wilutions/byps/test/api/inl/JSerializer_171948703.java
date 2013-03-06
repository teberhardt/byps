﻿package com.wilutions.byps.test.api.inl;

/*
 * Serializer for com.wilutions.byps.test.api.inl.Actor
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

@SuppressWarnings("all")
public class JSerializer_171948703 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_171948703();
	
	
	public JSerializer_171948703() {
		super(171948703);
	}
	
	public JSerializer_171948703(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Actor obj = (Actor)obj1;		
		bout.writeObj("position",obj.position, false, com.wilutions.byps.test.api.inl.JSerializer_135329019.instance);
		bout.writeObj("shape",obj.shape, false, com.wilutions.byps.test.api.JSerializer_2049740106.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Actor obj = (Actor)(obj1 != null ? obj1 : bin.onObjectCreated(new Actor()));
		
		final BJsonObject js = bin.currentObject;
		obj.position = (com.wilutions.byps.test.api.inl.Matrix2D)bin.readObj("position", false, com.wilutions.byps.test.api.inl.JSerializer_135329019.instance);
		obj.shape = (com.wilutions.byps.test.api.inl.Point2D[])bin.readObj("shape", false, com.wilutions.byps.test.api.JSerializer_2049740106.instance);
		
		return obj;
	}
	
}

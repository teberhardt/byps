﻿package com.wilutions.byps.test.api.inl;

/*
 * Serializer for com.wilutions.byps.test.api.inl.Point2D
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=true
// #members=2

@SuppressWarnings("all")
public class JSerializer_1835035436 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1835035436();
	
	
	public JSerializer_1835035436() {
		super(1835035436, true);
	}
	
	public JSerializer_1835035436(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Point2D obj = (Point2D)(obj1 != null ? obj1 : read(null, null, 0));		
		bbuf.putShort("x", obj.x);
		bbuf.putShort("y", obj.y);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Point2D obj = (Point2D)(obj1 != null ? obj1 : new Point2D());
		
		if (bin != null) {
			final BJsonObject js = bin.currentObject;
			obj.x = js.getShort("x");
			obj.y = js.getShort("y");
			
		}
		return obj;
	}
	
}

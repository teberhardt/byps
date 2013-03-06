﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.lang.Object[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_183594037 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_183594037();
	
	public JSerializer_183594037() {
		super(183594037);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final java.lang.Object[] arr =  new java.lang.Object[n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.lang.Object[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = (java.lang.Object)bin.readObj(i0, false, null);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final java.lang.Object[] arr = (java.lang.Object[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final java.lang.Object[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			bout.writeObj(null, a0[i0], false, null);
		}
		bbuf.endArray();
	}
	
}

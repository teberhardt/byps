﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.lang.String[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1888107655 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1888107655();
	
	public JSerializer_1888107655() {
		super(1888107655);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final java.lang.String[] arr =  new java.lang.String[n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.lang.String[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bin.currentObject.getString(i0);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final java.lang.String[] arr = (java.lang.String[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final java.lang.String[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putString(a0[i0] != null ? (String)a0[i0] : "");
		}
		bbuf.endArray();
	}
	
}

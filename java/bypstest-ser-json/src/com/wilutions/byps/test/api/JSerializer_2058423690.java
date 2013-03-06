﻿package com.wilutions.byps.test.api;

/*
 * Serializer for boolean[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_2058423690 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_2058423690();
	
	public JSerializer_2058423690() {
		super(2058423690);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final boolean[] arr =  new boolean[n0];
		bin.onObjectCreated(arr);
		
		// read
		final boolean[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bin.currentObject.getBoolean(i0);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final boolean[] arr = (boolean[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final boolean[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putBoolean(a0[i0]);
		}
		bbuf.endArray();
	}
	
}

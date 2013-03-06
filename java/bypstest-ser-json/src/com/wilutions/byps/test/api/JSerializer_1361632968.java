﻿package com.wilutions.byps.test.api;

/*
 * Serializer for char[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1361632968 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1361632968();
	
	public JSerializer_1361632968() {
		super(1361632968);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final char[] arr =  new char[n0];
		bin.onObjectCreated(arr);
		
		// read
		final char[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bin.currentObject.getChar(i0);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final char[] arr = (char[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final char[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putChar(a0[i0]);
		}
		bbuf.endArray();
	}
	
}

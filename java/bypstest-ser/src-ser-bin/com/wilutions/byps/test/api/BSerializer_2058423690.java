﻿package com.wilutions.byps.test.api;

/*
 * Serializer for boolean[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_2058423690 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2058423690();
	
	public BSerializer_2058423690() {
		super(2058423690);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 4;
		final boolean[] arr = (boolean[])obj;
		int n = arr.length;
		return bmodel.computeArrayWireSize(elementSize, n);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n0 = bbuf.getLength();
		
		// create array
		final boolean[] arr =  new boolean[n0];
		bin.onObjectCreated(arr);
		
		// read
		final boolean[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bbuf.getBoolean();
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final boolean[] arr = (boolean[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		// write
		final boolean[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putBoolean(a0[i0]);
		}
	}
	
}

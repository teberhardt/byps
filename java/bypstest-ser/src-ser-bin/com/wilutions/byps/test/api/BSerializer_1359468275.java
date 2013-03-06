﻿package com.wilutions.byps.test.api;

/*
 * Serializer for double[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1359468275 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1359468275();
	
	public BSerializer_1359468275() {
		super(1359468275);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 8;
		final double[] arr = (double[])obj;
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
		final double[] arr =  new double[n0];
		bin.onObjectCreated(arr);
		
		// read
		final double[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bbuf.getDouble();
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final double[] arr = (double[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		// write
		final double[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putDouble(a0[i0]);
		}
	}
	
}

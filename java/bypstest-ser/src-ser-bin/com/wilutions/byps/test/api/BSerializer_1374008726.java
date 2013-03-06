﻿package com.wilutions.byps.test.api;

/*
 * Serializer for byte[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1374008726 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1374008726();
	
	public BSerializer_1374008726() {
		super(1374008726);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 1;
		final byte[] arr = (byte[])obj;
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
		final byte[] arr =  new byte[n0];
		bin.onObjectCreated(arr);
		
		// read
		final byte[] a0 = arr;
		bin.bbuf.getArrayByte(a0);
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final byte[] arr = (byte[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		// write
		final byte[] a0 = arr;
		bout.bbuf.putArrayByte(a0);
	}
	
}

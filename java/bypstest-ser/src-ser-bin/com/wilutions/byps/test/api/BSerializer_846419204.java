﻿package com.wilutions.byps.test.api;

/*
 * Serializer for long[][][][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_846419204 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_846419204();
	
	public BSerializer_846419204() {
		super(846419204);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 8;
		final long[][][][] arr = (long[][][][])obj;
		int n = arr.length;
		if (n != 0) {
			n *= arr[0].length;
			if (n != 0) {
				n *= arr[0][0].length;
				if (n != 0) {
					n *= arr[0][0][0].length;
				}
			}
		}
		return bmodel.computeArrayWireSize(elementSize, n);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n3 = bbuf.getLength();
		final int n2 = bbuf.getLength();
		final int n1 = bbuf.getLength();
		final int n0 = bbuf.getLength();
		
		// create array
		final long[][][][] arr =  new long[n3][n2][n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final long[][][][] a3 = arr;
		for (int i3 = 0; i3 < n3; i3++) {
			final long[][][] a2 = a3[i3];
			for (int i2 = 0; i2 < n2; i2++) {
				final long[][] a1 = a2[i2];
				for (int i1 = 0; i1 < n1; i1++) {
					final long[] a0 = a1[i1];
					for (int i0 = 0; i0 < n0; i0++) {
						a0[i0] = bbuf.getLong();
					}
				}
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final long[][][][] arr = (long[][][][])obj1;
		
		// lengths
		final int n3 = arr.length;
		final int n2 = n3!=0 ? arr[0].length : 0;
		final int n1 = n2!=0 ? arr[0][0].length : 0;
		final int n0 = n1!=0 ? arr[0][0][0].length : 0;
		bbuf.putLength(n3);
		bbuf.putLength(n2);
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final long[][][][] a3 = arr;
		for (int i3 = 0; i3 < n3; i3++) {
			final long[][][] a2 = a3[i3];
			for (int i2 = 0; i2 < n2; i2++) {
				final long[][] a1 = a2[i2];
				for (int i1 = 0; i1 < n1; i1++) {
					final long[] a0 = a1[i1];
					for (int i0 = 0; i0 < n0; i0++) {
						bbuf.putLong(a0[i0]);
					}
				}
			}
		}
	}
	
}

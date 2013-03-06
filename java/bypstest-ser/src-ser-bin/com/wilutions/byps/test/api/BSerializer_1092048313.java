﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.enu.EnumPlanets[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1092048313 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1092048313();
	
	public BSerializer_1092048313() {
		super(1092048313);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 4;
		final com.wilutions.byps.test.api.enu.EnumPlanets[] arr = (com.wilutions.byps.test.api.enu.EnumPlanets[])obj;
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
		final com.wilutions.byps.test.api.enu.EnumPlanets[] arr =  new com.wilutions.byps.test.api.enu.EnumPlanets[n0];
		bin.onObjectCreated(arr);
		
		// read
		final com.wilutions.byps.test.api.enu.EnumPlanets[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = BEnumHelper.fromOrdinal(com.wilutions.byps.test.api.enu.EnumPlanets.values(), bbuf.getInt());
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final com.wilutions.byps.test.api.enu.EnumPlanets[] arr = (com.wilutions.byps.test.api.enu.EnumPlanets[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		// write
		final com.wilutions.byps.test.api.enu.EnumPlanets[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putInt(a0[i0] != null ? ((com.wilutions.byps.test.api.enu.EnumPlanets)a0[i0]).ordinal() : 0);
		}
	}
	
}

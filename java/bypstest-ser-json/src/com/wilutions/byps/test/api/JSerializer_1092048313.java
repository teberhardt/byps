﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.enu.EnumPlanets[]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1092048313 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1092048313();
	
	public JSerializer_1092048313() {
		super(1092048313);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final com.wilutions.byps.test.api.enu.EnumPlanets[] arr =  new com.wilutions.byps.test.api.enu.EnumPlanets[n0];
		bin.onObjectCreated(arr);
		
		// read
		final com.wilutions.byps.test.api.enu.EnumPlanets[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = BEnumHelper.fromOrdinal(com.wilutions.byps.test.api.enu.EnumPlanets.values(), bin.currentObject.getInt(i0));
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final com.wilutions.byps.test.api.enu.EnumPlanets[] arr = (com.wilutions.byps.test.api.enu.EnumPlanets[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final com.wilutions.byps.test.api.enu.EnumPlanets[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putInt(a0[i0] != null ? ((com.wilutions.byps.test.api.enu.EnumPlanets)a0[i0]).ordinal() : 0);
		}
		bbuf.endArray();
	}
	
}

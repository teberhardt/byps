﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.cons.AllTypesZ[][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1981543076 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1981543076();
	
	public JSerializer_1981543076() {
		super(1981543076);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js1 = bin.currentObject;
		
		int n1 = 0, n0 = 0;
		n1 = js1 != null ? js1.size() : 0;
		if (n1 != 0) {
			final BJsonObject js0 = js1.getJsonObject(0);
			n0 = js0 != null ? js0.size() : 0;
		}
		
		final com.wilutions.byps.test.api.cons.AllTypesZ[][] arr =  new com.wilutions.byps.test.api.cons.AllTypesZ[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final com.wilutions.byps.test.api.cons.AllTypesZ[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.cons.AllTypesZ[] a0 = a1[i1];
			bin.currentObject = js1.getJsonObject(i1);
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = (com.wilutions.byps.test.api.cons.AllTypesZ)bin.readObj(i0, false, null);
			}
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final com.wilutions.byps.test.api.cons.AllTypesZ[][] arr = (com.wilutions.byps.test.api.cons.AllTypesZ[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		
		// write
		final com.wilutions.byps.test.api.cons.AllTypesZ[][] a1 = arr;
		bbuf.beginArray();
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.cons.AllTypesZ[] a0 = a1[i1];
			bbuf.beginArray();
			for (int i0 = 0; i0 < n0; i0++) {
				bout.writeObj(null, a0[i0], false, null);
			}
			bbuf.endArray();
		}
		bbuf.endArray();
	}
	
}

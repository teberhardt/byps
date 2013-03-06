﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Byte>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1059148284 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1059148284();
	
	public BSerializer_1059148284() {
		super(1059148284);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<java.lang.Byte> arr = new ArrayList<java.lang.Byte>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Byte obj = bbuf.getByte();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.lang.Byte> arr = (java.util.List<java.lang.Byte>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Byte obj : arr) {
			bbuf.putByte(obj != null ? (Byte)obj : ((byte)0));
		}
	}
	
}

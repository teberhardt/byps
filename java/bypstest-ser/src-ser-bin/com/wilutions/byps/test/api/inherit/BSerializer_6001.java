﻿package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.Class1
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

@SuppressWarnings("all")
public class BSerializer_6001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_6001();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: int1 */ + 4		
		       /* pos=4: nextClass1 */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_6001() {
		super(6001);
	}
	
	public BSerializer_6001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final Class1 obj = (Class1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.int1);
		bout.writeObj(obj.nextClass1, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final Class1 obj = (Class1)(obj1 != null ? obj1 : bin.onObjectCreated(new Class1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.int1 = bbuf.getInt();
		obj.nextClass1 = (com.wilutions.byps.test.api.inherit.Class1)bin.readObj(false, null);
		
		return obj;
	}
	
}

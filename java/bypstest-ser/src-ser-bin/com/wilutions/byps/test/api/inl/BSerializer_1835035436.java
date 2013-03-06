﻿package com.wilutions.byps.test.api.inl;

/*
 * Serializer for com.wilutions.byps.test.api.inl.Point2D
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=true
// #members=2

@SuppressWarnings("all")
public class BSerializer_1835035436 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1835035436();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: x */ + 2		
		       /* pos=2: y */ + 2		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1835035436() {
		super(1835035436, true);
	}
	
	public BSerializer_1835035436(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final Point2D obj = (Point2D)(obj1 != null ? obj1 : read(null, null, 0));		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putShort(obj.x);
		bbuf.putShort(obj.y);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final Point2D obj = (Point2D)(obj1 != null ? obj1 : new Point2D());
		
		if (bin != null) {
			final BBufferBin bbuf = bin.bbuf;
			
			obj.x = bbuf.getShort();
			obj.y = bbuf.getShort();
			
		}
		return obj;
	}
	
}

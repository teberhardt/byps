package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BRequest_FruitService_squeeze
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_656804784 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_656804784();
	
	public BSerializer_656804784() {
		super(656804784);
	}
	
	public BSerializer_656804784(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_FruitService_squeeze obj = (BRequest_FruitService_squeeze)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FruitService_squeeze()));
		
		return obj;
	}
	
}

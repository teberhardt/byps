package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DArray4dim
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
public class BSerializer_1012059475 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1012059475();
	
	public BSerializer_1012059475() {
		super(1012059475);
	}
	
	public BSerializer_1012059475(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_getPoint2DArray4dim obj = (BRequest_RemoteInlineInstance_getPoint2DArray4dim)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_getPoint2DArray4dim()));
		
		return obj;
	}
	
}

package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteSetTypes_setByte2
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1608170285 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1608170285();
	
	public BSerializer_1608170285() {
		super(1608170285);
	}
	
	public BSerializer_1608170285(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteSetTypes_setByte2 obj = (BRequest_RemoteSetTypes_setByte2)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.byte2, false, com.wilutions.byps.test.api.BSerializer_2052431866.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteSetTypes_setByte2 obj = (BRequest_RemoteSetTypes_setByte2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setByte2()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.byte2 = (java.util.Set<byte[]>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2052431866.instance);
		
		return obj;
	}
	
}

package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteMapTypes_setChar1
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
public class BSerializer_1909424616 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1909424616();
	
	public BSerializer_1909424616() {
		super(1909424616);
	}
	
	public BSerializer_1909424616(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteMapTypes_setChar1 obj = (BRequest_RemoteMapTypes_setChar1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.char1, false, com.wilutions.byps.test.api.BSerializer_8789515.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteMapTypes_setChar1 obj = (BRequest_RemoteMapTypes_setChar1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setChar1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.char1 = (java.util.TreeMap<java.lang.Float,java.lang.Character>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_8789515.instance);
		
		return obj;
	}
	
}

﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteConstants_compare_HebrewC
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

@SuppressWarnings("all")
public class BSerializer_1570751625 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1570751625();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: ALEPH */ + 4		
		       /* pos=4: BETH */ + 4		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_1570751625() {
		super(1570751625);
	}
	
	public BSerializer_1570751625(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteConstants_compare_HebrewC obj = (BRequest_RemoteConstants_compare_HebrewC)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.ALEPH, false, null);
		bout.writeObj(obj.BETH, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteConstants_compare_HebrewC obj = (BRequest_RemoteConstants_compare_HebrewC)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteConstants_compare_HebrewC()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.ALEPH = (com.wilutions.byps.test.api.cons.HebrewZ)bin.readObj(false, null);
		obj.BETH = (com.wilutions.byps.test.api.cons.HebrewZ)bin.readObj(false, null);
		
		return obj;
	}
	
}

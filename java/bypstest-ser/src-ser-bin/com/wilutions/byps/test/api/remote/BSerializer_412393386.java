﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteEnums_setPlanet
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class BSerializer_412393386 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_412393386();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: planet */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_412393386() {
		super(412393386);
	}
	
	public BSerializer_412393386(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteEnums_setPlanet obj = (BRequest_RemoteEnums_setPlanet)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.planet!=null ? obj.planet.ordinal() : 0);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteEnums_setPlanet obj = (BRequest_RemoteEnums_setPlanet)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteEnums_setPlanet()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.planet = BEnumHelper.fromOrdinal(com.wilutions.byps.test.api.enu.EnumPlanets.values(), bbuf.getInt());
		
		return obj;
	}
	
}

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
public class JSerializer_412393386 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_412393386();
	
	
	public JSerializer_412393386() {
		super(412393386);
	}
	
	public JSerializer_412393386(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteEnums_setPlanet obj = (BRequest_RemoteEnums_setPlanet)obj1;		
		bbuf.putInt("planet", obj.planet!=null ? obj.planet.ordinal() : 0);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteEnums_setPlanet obj = (BRequest_RemoteEnums_setPlanet)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteEnums_setPlanet()));
		
		final BJsonObject js = bin.currentObject;
		obj.planet = BEnumHelper.fromOrdinal(com.wilutions.byps.test.api.enu.EnumPlanets.values(), js.getInt("planet"));
		
		return obj;
	}
	
}

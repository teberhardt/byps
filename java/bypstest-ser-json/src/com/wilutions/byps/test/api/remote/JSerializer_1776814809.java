package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteServerCtrl_publishRemote
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1776814809 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1776814809();
	
	public JSerializer_1776814809() {
		super(1776814809);
	}
	
	public JSerializer_1776814809(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteServerCtrl_publishRemote obj = (BRequest_RemoteServerCtrl_publishRemote)obj1;		
		bbuf.putBoolean("fowardToOtherServers", obj.fowardToOtherServers);
		bbuf.putString("name", obj.name);
		bout.writeObj("remote",obj.remote, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteServerCtrl_publishRemote obj = (BRequest_RemoteServerCtrl_publishRemote)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteServerCtrl_publishRemote()));
		
		final BJsonObject js = bin.currentObject;
		obj.fowardToOtherServers = js.getBoolean("fowardToOtherServers");
		obj.name = js.getString("name");
		obj.remote = (BRemote)bin.readObj("remote", false, null);
		
		return obj;
	}
	
}

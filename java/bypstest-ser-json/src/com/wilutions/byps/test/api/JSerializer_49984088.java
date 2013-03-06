﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_49984088 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_49984088();
	
	public JSerializer_49984088() {
		super(49984088);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>> map = new HashMap<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Integer key = keyName != null && keyName.length() != 0 ? Integer.parseInt(keyName) : 0;
			final java.util.List<java.util.TreeSet<java.lang.Integer>> value = (java.util.List<java.util.TreeSet<java.lang.Integer>>)bin.readObj(keyName, false, com.wilutions.byps.test.api.JSerializer_724129228.instance);
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		bout.writeObj(keyName, value, false, com.wilutions.byps.test.api.JSerializer_724129228.instance);
	}
	
}

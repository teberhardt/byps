﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.TreeMap<java.lang.Integer,java.io.InputStream>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_476459792 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_476459792();
	
	public JSerializer_476459792() {
		super(476459792);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final TreeMap<java.lang.Integer,java.io.InputStream> map = new TreeMap<java.lang.Integer,java.io.InputStream>();
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Integer key = keyName != null && keyName.length() != 0 ? Integer.parseInt(keyName) : 0;
			final java.io.InputStream value = (java.io.InputStream)bin.readObj(keyName, false, null);
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		bout.writeObj(keyName, value, false, null);
	}
	
}

﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Character,java.lang.Float>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_94341197 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_94341197();
	
	public JSerializer_94341197() {
		super(94341197);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Character,java.lang.Float> map = new HashMap<java.lang.Character,java.lang.Float>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Character key = keyName.charAt(0);
			final java.lang.Float value = js.getFloat(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		bbuf.putFloat(keyName, value != null ? (Float)value : 0.0f);
	}
	
}

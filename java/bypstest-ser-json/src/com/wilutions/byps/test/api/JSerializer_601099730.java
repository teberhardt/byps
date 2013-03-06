﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Long,java.lang.Short>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_601099730 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_601099730();
	
	public JSerializer_601099730() {
		super(601099730);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Long,java.lang.Short> map = new HashMap<java.lang.Long,java.lang.Short>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Long key = keyName != null && keyName.length() != 0 ? BBufferJson.parseLong(keyName) : 0L;
			final java.lang.Short value = js.getShort(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		bbuf.putShort(keyName, value != null ? (Short)value : ((short)0));
	}
	
}

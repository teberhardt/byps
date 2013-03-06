﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Integer,byte[]>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1799280818 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_1799280818();
	
	public JSerializer_1799280818() {
		super(1799280818);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Integer,byte[]> map = new HashMap<java.lang.Integer,byte[]>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Integer key = keyName != null && keyName.length() != 0 ? Integer.parseInt(keyName) : 0;
			final byte[] value = js.getArrayByte(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		bbuf.putArrayByte(keyName, (byte[])value);
	}
	
}

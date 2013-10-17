package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1463615848 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1463615848();
	
	public JSerializer_1463615848() {
		super(1463615848);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<List<com.wilutions.byps.test.api.inl.Point2D>> arr = new ArrayList<List<com.wilutions.byps.test.api.inl.Point2D>>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.List<com.wilutions.byps.test.api.inl.Point2D> obj = (java.util.List<com.wilutions.byps.test.api.inl.Point2D>)bin.readObj(i0, false, com.wilutions.byps.test.api.JSerializer_172221196.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> arr = (java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.util.List<com.wilutions.byps.test.api.inl.Point2D> obj : arr) {
			bout.writeObj(null, obj, false, com.wilutions.byps.test.api.JSerializer_172221196.instance);
		}
		bbuf.endArray();
	}
	
}

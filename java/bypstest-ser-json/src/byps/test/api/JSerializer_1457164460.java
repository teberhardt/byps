package byps.test.api;

/*
 * Serializer for java.util.Set<java.lang.Long>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1457164460 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1457164460();
	
	public JSerializer_1457164460() {
		super(1457164460);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final HashSet<java.lang.Long> arr = new HashSet<java.lang.Long>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Long obj = bin.currentObject.getLong(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.Set<java.lang.Long> arr = (java.util.Set<java.lang.Long>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.lang.Long obj : arr) {
			// checkpoint byps.gen.j.PrintContext:348
			bbuf.putLong(obj != null ? (Long)obj : 0L);
		}
		bbuf.endArray();
	}
	
}

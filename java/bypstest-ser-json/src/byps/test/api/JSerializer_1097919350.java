package byps.test.api;

/*
 * Serializer for java.util.Set<java.util.Date>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1097919350 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1097919350();
	
	public JSerializer_1097919350() {
		super(1097919350);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final HashSet<Date> arr = new HashSet<Date>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.Date obj = bin.currentObject.getDate(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.Set<java.util.Date> arr = (java.util.Set<java.util.Date>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.util.Date obj : arr) {
			// checkpoint byps.gen.j.PrintContext:372
			bbuf.putDate((java.util.Date)obj);
		}
		bbuf.endArray();
	}
	
}

package byps.test.api;

/*
 * Serializer for java.util.ArrayList<byps.test.api.enu.EnumPlanets>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_819140569 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_819140569();
	
	public JSerializer_819140569() {
		super(819140569);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<byps.test.api.enu.EnumPlanets> arr = new ArrayList<byps.test.api.enu.EnumPlanets>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			byps.test.api.enu.EnumPlanets obj = BEnumHelper.fromOrdinal(byps.test.api.enu.EnumPlanets.values(), bin.currentObject.getInt(i0));
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.ArrayList<byps.test.api.enu.EnumPlanets> arr = (java.util.ArrayList<byps.test.api.enu.EnumPlanets>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (byps.test.api.enu.EnumPlanets obj : arr) {
			// checkpoint byps.gen.j.PrintContext:359
			bbuf.putInt(obj != null ? ((byps.test.api.enu.EnumPlanets)obj).ordinal() : 0);
		}
		bbuf.endArray();
	}
	
}

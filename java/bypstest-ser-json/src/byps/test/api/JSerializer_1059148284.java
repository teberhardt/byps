package byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Byte>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1059148284 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1059148284();
	
	public JSerializer_1059148284() {
		super(1059148284);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<java.lang.Byte> arr = new ArrayList<java.lang.Byte>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Byte obj = bin.currentObject.getByte(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<java.lang.Byte> arr = (java.util.List<java.lang.Byte>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.lang.Byte obj : arr) {
			// checkpoint byps.gen.j.PrintContext:359
			bbuf.putByte(obj != null ? (Byte)obj : ((byte)0));
		}
		bbuf.endArray();
	}
	
}

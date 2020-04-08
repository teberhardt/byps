package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.String,java.util.Date>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMap DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1366799209 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1366799209();
	
	public BSerializer_1366799209() {
		super(1366799209);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.String,java.util.Date> map = new HashMap<java.lang.String,java.util.Date>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.String key = bbuf.getString();
			java.util.Date value = bbuf.getDate();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.String,Date> map = (Map<java.lang.String,Date>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.String,java.util.Date> obj : map.entrySet()) {
			// checkpoint byps.gen.j.PrintContext:361
			bbuf.putString(obj.getKey() != null ? (String)obj.getKey() : "");
			// checkpoint byps.gen.j.PrintContext:372
			bbuf.putDate((java.util.Date)obj.getValue());
		}
	}
	
}

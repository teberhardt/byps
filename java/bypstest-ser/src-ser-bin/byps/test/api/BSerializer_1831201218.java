package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMap DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1831201218 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1831201218();
	
	public BSerializer_1831201218() {
		super(1831201218);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> map = new HashMap<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Integer key = bbuf.getInt();
			byps.test.api.prim.PrimitiveTypes value = (byps.test.api.prim.PrimitiveTypes)bin.readObj(false, null);
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> map = (Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> obj : map.entrySet()) {
			// checkpoint byps.gen.j.PrintContext:359
			bbuf.putInt(obj.getKey() != null ? (Integer)obj.getKey() : 0);
			// checkpoint byps.gen.j.PrintContext:340
			bout.writeObj(obj.getValue(), false, null);
		}
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> map = (Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>)obj1;
		for (Map.Entry<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> obj : map.entrySet()) {
			bin.prepareForLazyLoading(obj.getValue(), null);
		}
	}
	
}

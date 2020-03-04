package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMapJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1831201218 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_1831201218();
	
	public JSerializer_1831201218() {
		super(1831201218);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> map = new HashMap<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Integer key = keyName != null && keyName.length() != 0 ? Integer.parseInt(keyName) : 0;
			final byps.test.api.prim.PrimitiveTypes value = (byps.test.api.prim.PrimitiveTypes)bin.readObj(keyName, false, null);
			map.put(key, value);
		}
		return map;
	}
	
	// checkpoint byps.gen.j.GenSerMapJson:80
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		// checkpoint byps.gen.j.PrintContext:329
		bout.writeObj(keyName, value, false, null);
	}
	
}

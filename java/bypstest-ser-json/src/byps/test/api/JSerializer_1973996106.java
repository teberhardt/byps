package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Short,java.lang.Long>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMapJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1973996106 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_1973996106();
	
	public JSerializer_1973996106() {
		super(1973996106);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Short,java.lang.Long> map = new HashMap<java.lang.Short,java.lang.Long>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Short key = keyName != null && keyName.length() != 0 ? Short.parseShort(keyName) : (short)0;
			final java.lang.Long value = js.getLong(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	// checkpoint byps.gen.j.GenSerMapJson:80
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		// checkpoint byps.gen.j.PrintContext:361
		bbuf.putLong(keyName, value != null ? (Long)value : 0L);
	}
	
}

package byps.test.api;

/*
 * Serializer for byps.test.api.enu.EnumPlanets[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_1441131650 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1441131650();
	
	public JSerializer_1441131650() {
		super(1441131650);
	}
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final byps.test.api.enu.EnumPlanets[] arr =  new byps.test.api.enu.EnumPlanets[n0];
		bin.onObjectCreated(arr);
		
		// read
		final byps.test.api.enu.EnumPlanets[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = BEnumHelper.fromOrdinal(byps.test.api.enu.EnumPlanets.values(), bin.currentObject.getInt(i0));
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final byps.test.api.enu.EnumPlanets[] arr = (byps.test.api.enu.EnumPlanets[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final byps.test.api.enu.EnumPlanets[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:372
			bbuf.putInt(a0[i0] != null ? ((byps.test.api.enu.EnumPlanets)a0[i0]).ordinal() : 0);
		}
		bbuf.endArray();
	}
	
}

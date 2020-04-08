package byps.test.api;

/*
 * Serializer for byps.test.api.inl.Point2D[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_184101377 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_184101377();
	
	public JSerializer_184101377() {
		super(184101377);
	}
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final byps.test.api.inl.Point2D[] arr =  new byps.test.api.inl.Point2D[n0];
		bin.onObjectCreated(arr);
		
		// read
		final byps.test.api.inl.Point2D[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = (byps.test.api.inl.Point2D)bin.readObj(i0, false, byps.test.api.inl.JSerializer_1835035436.instance);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final byps.test.api.inl.Point2D[] arr = (byps.test.api.inl.Point2D[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final byps.test.api.inl.Point2D[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:340
			bout.writeObj(null, a0[i0], false, byps.test.api.inl.JSerializer_1835035436.instance);
		}
		bbuf.endArray();
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		byps.test.api.inl.Point2D[] arr = (byps.test.api.inl.Point2D[])obj1;
		final int n0 = arr.length;
		
		final byps.test.api.inl.Point2D[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			bin.prepareForLazyLoading(a0[i0], byps.test.api.inl.BSerializer_1835035436.instance);
		}
	}
	
}

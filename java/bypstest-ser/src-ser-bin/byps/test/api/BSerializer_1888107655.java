package byps.test.api;

/*
 * Serializer for java.lang.String[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArray DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_1888107655 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1888107655();
	
	public BSerializer_1888107655() {
		super(1888107655);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n0 = bbuf.getLength();
		
		// create array
		final java.lang.String[] arr =  new java.lang.String[n0];
		bin.onObjectCreated(arr);
		
		
		final java.lang.String[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bbuf.getString();
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final java.lang.String[] arr = (java.lang.String[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		
		final java.lang.String[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:361
			bbuf.putString(a0[i0] != null ? (String)a0[i0] : "");
		}
	}
	
}

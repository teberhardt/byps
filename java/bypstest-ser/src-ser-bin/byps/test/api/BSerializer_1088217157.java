package byps.test.api;

/*
 * Serializer for java.util.List<int[][][][]>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1088217157 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1088217157();
	
	public BSerializer_1088217157() {
		super(1088217157);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<int[][][][]> arr = new ArrayList<int[][][][]>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			int[][][][] obj = (int[][][][])bin.readObj(false, byps.test.api.BSerializer_39910537.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<int[][][][]> arr = (java.util.List<int[][][][]>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (int[][][][] obj : arr) {
			// checkpoint byps.gen.j.PrintContext:342
			bout.writeObj(obj, false, byps.test.api.BSerializer_39910537.instance);
		}
	}
	
}

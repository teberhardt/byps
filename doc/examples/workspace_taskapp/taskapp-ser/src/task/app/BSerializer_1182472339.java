package task.app;

/*
 * Serializer for java.util.List<task.app.TaskInfo>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1182472339 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1182472339();
	
	public BSerializer_1182472339() {
		super(1182472339);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<task.app.TaskInfo> arr = new ArrayList<task.app.TaskInfo>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			task.app.TaskInfo obj = (task.app.TaskInfo)bin.readObj(false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<task.app.TaskInfo> arr = (java.util.List<task.app.TaskInfo>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (task.app.TaskInfo obj : arr) {
			// checkpoint byps.gen.j.PrintContext:313
			bout.writeObj(obj, false, null);
		}
	}
	
}

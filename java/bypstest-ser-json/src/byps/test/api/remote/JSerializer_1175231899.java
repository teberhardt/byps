package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysString
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_1175231899 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1175231899();
	
	public JSerializer_1175231899() {
		super(1175231899);
	}
	
	public JSerializer_1175231899(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysString obj = (BRequest_RemoteArrayTypes23_sendArraysString)obj1;		
		bout.writeObj("arr2",obj.arr2, true, byps.test.api.JSerializer_1995260457.instance);
		bout.writeObj("arr3",obj.arr3, true, byps.test.api.JSerializer_1889888075.instance);
		bout.writeObj("arr4",obj.arr4, true, byps.test.api.JSerializer_588723219.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysString obj = (BRequest_RemoteArrayTypes23_sendArraysString)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysString()));
		
		final BJsonObject js = bin.currentObject;
		obj.arr2 = (java.lang.String[][])bin.readObj("arr2", true, byps.test.api.JSerializer_1995260457.instance);
		obj.arr3 = (java.lang.String[][][])bin.readObj("arr3", true, byps.test.api.JSerializer_1889888075.instance);
		obj.arr4 = (java.lang.String[][][][])bin.readObj("arr4", true, byps.test.api.JSerializer_588723219.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysString obj = (BRequest_RemoteArrayTypes23_sendArraysString)(obj1);		
		
	}
	
}

package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteSetTypes_setObj1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_462464544 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_462464544();
	
	public JSerializer_462464544() {
		super(462464544);
	}
	
	public JSerializer_462464544(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteSetTypes_setObj1 obj = (BRequest_RemoteSetTypes_setObj1)obj1;		
		bout.writeObj("obj1",obj.obj1, false, byps.JSerializer_14.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_setObj1 obj = (BRequest_RemoteSetTypes_setObj1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setObj1()));
		
		final BJsonObject js = bin.currentObject;
		obj.obj1 = (java.util.Set<java.lang.Object>)bin.readObj("obj1", false, byps.JSerializer_14.instance);
		
		return obj;
	}
	
}

package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setShort
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_1480543961 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1480543961();
	
	public JSerializer_1480543961() {
		super(1480543961);
	}
	
	public JSerializer_1480543961(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setShort obj = (BRequest_RemoteArrayTypes4dim_setShort)obj1;		
		bout.writeObj("v",obj.v, false, byps.test.api.JSerializer_1859644668.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setShort obj = (BRequest_RemoteArrayTypes4dim_setShort)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setShort()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (short[][][][])bin.readObj("v", false, byps.test.api.JSerializer_1859644668.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteArrayTypes4dim_setShort obj = (BRequest_RemoteArrayTypes4dim_setShort)(obj1);		
		
	}
	
}

package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BRequest_ServerIF_callClientParallel
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
public class JSerializer_772308436 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_772308436();
	
	public JSerializer_772308436() {
		super(772308436);
	}
	
	public JSerializer_772308436(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ServerIF_callClientParallel obj = (BRequest_ServerIF_callClientParallel)obj1;		
		bbuf.putInt("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ServerIF_callClientParallel obj = (BRequest_ServerIF_callClientParallel)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_callClientParallel()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getInt("v");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_ServerIF_callClientParallel obj = (BRequest_ServerIF_callClientParallel)(obj1);		
		
	}
	
}

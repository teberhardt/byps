package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getString
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_394678379 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_394678379();
	
	public JSerializer_394678379() {
		super(394678379);
	}
	
	public JSerializer_394678379(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_getString obj = (BRequest_RemoteArrayTypes1dim_getString)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_getString()));
		
		return obj;
	}
	
}
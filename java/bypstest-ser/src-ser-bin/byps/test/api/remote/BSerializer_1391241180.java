package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemotePrimitiveTypes
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_1391241180 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1391241180();
	
	public BSerializer_1391241180() {
		super(1391241180);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemotePrimitiveTypes(transport);
	}
	
}
package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BRequest_ServerIF_getClient
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_190669475 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_190669475();
	
	public BSerializer_190669475() {
		super(190669475);
	}
	
	public BSerializer_190669475(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_ServerIF_getClient obj = (BRequest_ServerIF_getClient)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.id);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_ServerIF_getClient obj = (BRequest_ServerIF_getClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_getClient()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.id = bbuf.getInt();
		
		return obj;
	}
	
}

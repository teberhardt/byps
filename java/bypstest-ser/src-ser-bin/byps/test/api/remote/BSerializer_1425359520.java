package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_setObject
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_1425359520 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1425359520();
	
	public BSerializer_1425359520() {
		super(1425359520);
	}
	
	public BSerializer_1425359520(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.v, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setObject()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = (java.lang.Object)bin.readObj(false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1);		
		bin.prepareForLazyLoading(obj.v, null);
		
	}
	
}

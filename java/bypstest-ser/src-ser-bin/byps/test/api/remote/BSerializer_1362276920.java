package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setPrimitiveTypes
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
public class BSerializer_1362276920 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1362276920();
	
	public BSerializer_1362276920() {
		super(1362276920);
	}
	
	public BSerializer_1362276920(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setPrimitiveTypes obj = (BRequest_RemoteArrayTypes1dim_setPrimitiveTypes)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.v, false, byps.test.api.BSerializer_2053507648.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes1dim_setPrimitiveTypes obj = (BRequest_RemoteArrayTypes1dim_setPrimitiveTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setPrimitiveTypes()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = (byps.test.api.prim.PrimitiveTypes[])bin.readObj(false, byps.test.api.BSerializer_2053507648.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setPrimitiveTypes obj = (BRequest_RemoteArrayTypes1dim_setPrimitiveTypes)(obj1);		
		bin.prepareForLazyLoading(obj.v, byps.test.api.BSerializer_2053507648.instance);
		
	}
	
}

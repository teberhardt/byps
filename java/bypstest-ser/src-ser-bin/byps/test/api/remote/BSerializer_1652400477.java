package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteStreams_getSharedStream
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
public class BSerializer_1652400477 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1652400477();
	
	public BSerializer_1652400477() {
		super(1652400477);
	}
	
	public BSerializer_1652400477(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteStreams_getSharedStream obj = (BRequest_RemoteStreams_getSharedStream)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putLong(obj.id);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteStreams_getSharedStream obj = (BRequest_RemoteStreams_getSharedStream)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_getSharedStream()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.id = bbuf.getLong();
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteStreams_getSharedStream obj = (BRequest_RemoteStreams_getSharedStream)(obj1);		
		
	}
	
}

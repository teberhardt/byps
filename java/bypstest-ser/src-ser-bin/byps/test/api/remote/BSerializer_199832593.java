package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteStreams_setStreamDoNotMaterialize
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
public class BSerializer_199832593 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_199832593();
	
	public BSerializer_199832593() {
		super(199832593);
	}
	
	public BSerializer_199832593(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteStreams_setStreamDoNotMaterialize obj = (BRequest_RemoteStreams_setStreamDoNotMaterialize)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.stream, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteStreams_setStreamDoNotMaterialize obj = (BRequest_RemoteStreams_setStreamDoNotMaterialize)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_setStreamDoNotMaterialize()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.stream = (java.io.InputStream)bin.readObj(false, null);
		
		return obj;
	}
	
}

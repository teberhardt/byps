package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DList
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_1428313263 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1428313263();
	
	public BSerializer_1428313263() {
		super(1428313263);
	}
	
	public BSerializer_1428313263(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_getPoint2DList obj = (BRequest_RemoteInlineInstance_getPoint2DList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_getPoint2DList()));
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
	}
	
}

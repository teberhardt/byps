package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BRequest_ClientIF_putStreams
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_2016865344 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2016865344();
	
	public BSerializer_2016865344() {
		super(2016865344);
	}
	
	public BSerializer_2016865344(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_ClientIF_putStreams obj = (BRequest_ClientIF_putStreams)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.ctrl);
		bout.writeObj(obj.strm, false, byps.test.api.BSerializer_1218831438.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_ClientIF_putStreams obj = (BRequest_ClientIF_putStreams)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ClientIF_putStreams()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.ctrl = bbuf.getInt();
		obj.strm = (java.util.List<java.io.InputStream>)bin.readObj(false, byps.test.api.BSerializer_1218831438.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_ClientIF_putStreams obj = (BRequest_ClientIF_putStreams)(obj1);		
		bin.prepareForLazyLoading(obj.strm, byps.test.api.BSerializer_1218831438.instance);
		
	}
	
}

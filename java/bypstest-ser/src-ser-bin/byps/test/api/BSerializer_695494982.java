package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_955752991
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
public class BSerializer_695494982 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_695494982();
	
	public BSerializer_695494982() {
		super(695494982);
	}
	
	public BSerializer_695494982(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_955752991 obj = (BResult_955752991)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_955752991 obj = (BResult_955752991)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_955752991()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (byps.test.api.srvr.ClientIF)bin.readObj(false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BResult_955752991 obj = (BResult_955752991)(obj1);		
		bin.prepareForLazyLoading(obj.result, null);
		
	}
	
}

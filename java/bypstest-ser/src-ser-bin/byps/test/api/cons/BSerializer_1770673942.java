package byps.test.api.cons;

/*
 * Serializer for byps.test.api.cons.HebrewC
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=4

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_1770673942 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1770673942();
	
	public BSerializer_1770673942() {
		super(1770673942);
	}
	
	public BSerializer_1770673942(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final HebrewC obj = (HebrewC)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final HebrewC obj = (HebrewC)(obj1 != null ? obj1 : bin.onObjectCreated(new HebrewC()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final HebrewC obj = (HebrewC)(obj1);		
		
	}
	
}

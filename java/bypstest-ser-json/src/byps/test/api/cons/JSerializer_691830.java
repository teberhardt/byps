package byps.test.api.cons;

/*
 * Serializer for byps.test.api.cons.SordZ
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_691830 extends byps.JSerializer_22 {
	
	public final static BSerializer instance = new JSerializer_691830();
	
	public JSerializer_691830() {
		super(691830);
	}
	
	public JSerializer_691830(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final SordZ obj = (SordZ)obj1;		
		super.internalWrite(obj1, bout, bbuf);		
		bbuf.putLong("bset", obj.bset);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final SordZ obj = (SordZ)(obj1 != null ? obj1 : bin.onObjectCreated(new SordZ()));
		
		// Read base class members
		super.internalRead(obj, bin);
		
		final BJsonObject js = bin.currentObject;
		obj.bset = js.getLong("bset");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		super.prepareForLazyLoading(obj1, bin, version);
		final SordZ obj = (SordZ)(obj1);		
		
	}
	
}
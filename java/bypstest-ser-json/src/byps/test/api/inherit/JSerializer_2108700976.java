package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.BRequest_BioLemonService_useParing
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_2108700976 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2108700976();
	
	public JSerializer_2108700976() {
		super(2108700976);
	}
	
	public JSerializer_2108700976(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_BioLemonService_useParing obj = (BRequest_BioLemonService_useParing)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_BioLemonService_useParing()));
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
	}
	
}

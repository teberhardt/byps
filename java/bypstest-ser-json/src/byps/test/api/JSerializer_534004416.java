package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_15
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_534004416 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_534004416();
	
	public JSerializer_534004416() {
		super(534004416);
	}
	
	public JSerializer_534004416(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_15 obj = (BResult_15)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_15 obj = (BResult_15)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_15()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.io.InputStream)bin.readObj("result", false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BResult_15 obj = (BResult_15)(obj1);		
		bin.prepareForLazyLoading(obj.result, null);
		
	}
	
}

package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteStreams_setImages
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_2126615710 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2126615710();
	
	public JSerializer_2126615710() {
		super(2126615710);
	}
	
	public JSerializer_2126615710(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteStreams_setImages obj = (BRequest_RemoteStreams_setImages)obj1;		
		bbuf.putInt("doNotReadStreamAtKey", obj.doNotReadStreamAtKey);
		bout.writeObj("istrms",obj.istrms, false, byps.test.api.JSerializer_779528402.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteStreams_setImages obj = (BRequest_RemoteStreams_setImages)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_setImages()));
		
		final BJsonObject js = bin.currentObject;
		obj.doNotReadStreamAtKey = js.getInt("doNotReadStreamAtKey");
		obj.istrms = (java.util.Map<java.lang.Integer,java.io.InputStream>)bin.readObj("istrms", false, byps.test.api.JSerializer_779528402.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteStreams_setImages obj = (BRequest_RemoteStreams_setImages)(obj1);		
		bin.prepareForLazyLoading(obj.istrms, byps.test.api.BSerializer_779528402.instance);
		
	}
	
}

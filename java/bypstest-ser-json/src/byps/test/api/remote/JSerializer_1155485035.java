package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions
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
public class JSerializer_1155485035 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1155485035();
	
	public JSerializer_1155485035() {
		super(1155485035);
	}
	
	public JSerializer_1155485035(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions obj = (BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions)obj1;		
		bbuf.putInt("sleepSeconds", obj.sleepSeconds);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions obj = (BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions()));
		
		final BJsonObject js = bin.currentObject;
		obj.sleepSeconds = js.getInt("sleepSeconds");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions obj = (BRequest_RemoteProcessingEx_getValueAfterProcessingExceptions)(obj1);		
		
	}
	
}

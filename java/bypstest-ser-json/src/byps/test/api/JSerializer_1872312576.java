package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_65775978
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
public class JSerializer_1872312576 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1872312576();
	
	public JSerializer_1872312576() {
		super(1872312576);
	}
	
	public JSerializer_1872312576(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_65775978 obj = (BResult_65775978)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_65775978 obj = (BResult_65775978)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_65775978()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (byps.test.api.auth.SessionInfo)bin.readObj("result", false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BResult_65775978 obj = (BResult_65775978)(obj1);		
		bin.prepareForLazyLoading(obj.result, null);
		
	}
	
}

package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setByte1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_685835107 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_685835107();
	
	public JSerializer_685835107() {
		super(685835107);
	}
	
	public JSerializer_685835107(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setByte1 obj = (BRequest_RemoteMapTypes_setByte1)obj1;		
		bout.writeObj("byte1",obj.byte1, false, byps.test.api.JSerializer_1972793385.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setByte1 obj = (BRequest_RemoteMapTypes_setByte1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setByte1()));
		
		final BJsonObject js = bin.currentObject;
		obj.byte1 = (java.util.HashMap<java.lang.Double,java.lang.Byte>)bin.readObj("byte1", false, byps.test.api.JSerializer_1972793385.instance);
		
		return obj;
	}
	
}
package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteForward DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteForward:145
public class BForward_FruitService extends BStub implements FruitServiceAsync {
	
	protected BForward_FruitService() {
	}
	
	public BForward_FruitService(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String grow() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<String> asyncResult = new BSyncResult<String>();		
		grow(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void grow(final BAsyncResult<String> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_PlantService_grow req = new BRequest_PlantService_grow();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String squeeze() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<String> asyncResult = new BSyncResult<String>();		
		squeeze(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void squeeze(final BAsyncResult<String> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_FruitService_squeeze req = new BRequest_FruitService_squeeze();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}

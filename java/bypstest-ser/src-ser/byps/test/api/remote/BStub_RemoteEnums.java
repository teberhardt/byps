package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteEnums extends BStub implements RemoteEnumsAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1222673152L;
	
	public BStub_RemoteEnums(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.enu.EnumPlanets getPlanet() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<byps.test.api.enu.EnumPlanets> asyncResult = new BSyncResult<byps.test.api.enu.EnumPlanets>();		
		getPlanet(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getPlanet(final BAsyncResult<byps.test.api.enu.EnumPlanets> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteEnums_getPlanet req = new BRequest_RemoteEnums_getPlanet();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setPlanet(byps.test.api.enu.EnumPlanets planet) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setPlanet(planet, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setPlanet(byps.test.api.enu.EnumPlanets planet, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteEnums_setPlanet req = new BRequest_RemoteEnums_setPlanet();		
		req.planet = planet;
		transport.sendMethod(req, asyncResult);
	}
	
	
}

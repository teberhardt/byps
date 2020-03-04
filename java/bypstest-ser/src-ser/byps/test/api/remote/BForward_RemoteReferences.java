package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteForward DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteForward:145
public class BForward_RemoteReferences extends BStub implements RemoteReferencesAsync {
	
	protected BForward_RemoteReferences() {
	}
	
	public BForward_RemoteReferences(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public byps.test.api.refs.Node getNode() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<byps.test.api.refs.Node> asyncResult = new BSyncResult<byps.test.api.refs.Node>();		
		getNode(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getNode(final BAsyncResult<byps.test.api.refs.Node> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteReferences_getNode req = new BRequest_RemoteReferences_getNode();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setNode(byps.test.api.refs.Node v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setNode(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setNode(byps.test.api.refs.Node v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteReferences_setNode req = new BRequest_RemoteReferences_setNode();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	
}

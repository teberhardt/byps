package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface RemoteReferencesAsync extends BRemote, 
	RemoteReferences {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:385
	public byps.test.api.refs.Node getNode() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:429
	public void getNode(final BAsyncResult<byps.test.api.refs.Node> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:385
	public void setNode(byps.test.api.refs.Node v) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:429
	public void setNode(byps.test.api.refs.Node v, final BAsyncResult<Object> asyncResult) ;
	
	
}

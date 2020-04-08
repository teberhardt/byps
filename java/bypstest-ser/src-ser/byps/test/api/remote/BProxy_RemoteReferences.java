package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteProxy DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a proxy implementation of the interface RemoteReferences.
 */
@SuppressWarnings("all")
public class BProxy_RemoteReferences extends BSkeleton_RemoteReferences implements RemoteReferencesAsync {
	
	public static final long serialVersionUID = 568637225L;
	
	protected final byps.test.api.remote.RemoteReferencesAsync forwardTo;
	
	public BProxy_RemoteReferences(RemoteReferencesAsync forwardTo) {
		this.forwardTo = forwardTo;
	}
	
	public BProxy_RemoteReferences(BTransport transport) {
		this(new BForward_RemoteReferences(transport));
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public byps.test.api.refs.Node getNode() throws RemoteException{
	  return forwardTo.getNode();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getNode(final BAsyncResult<byps.test.api.refs.Node> asyncResult) {
	  forwardTo.getNode(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setNode(byps.test.api.refs.Node v) throws RemoteException{
	  forwardTo.setNode(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setNode(byps.test.api.refs.Node v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setNode(v, asyncResult);
	}
	
	
}

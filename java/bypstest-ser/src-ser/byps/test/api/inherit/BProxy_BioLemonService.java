package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteProxy DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a proxy implementation of the interface BioLemonService.
 */
@SuppressWarnings("all")
public class BProxy_BioLemonService extends BSkeleton_BioLemonService implements BioLemonServiceAsync {
	
	public static final long serialVersionUID = 474058508L;
	
	protected final byps.test.api.inherit.BioLemonServiceAsync forwardTo;
	
	public BProxy_BioLemonService(BioLemonServiceAsync forwardTo) {
		this.forwardTo = forwardTo;
	}
	
	public BProxy_BioLemonService(BTransport transport) {
		this(new BForward_BioLemonService(transport));
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int useParing() throws RemoteException{
	  return forwardTo.useParing();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void useParing(final BAsyncResult<Integer> asyncResult) {
	  forwardTo.useParing(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String squeeze() throws RemoteException{
	  return forwardTo.squeeze();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void squeeze(final BAsyncResult<String> asyncResult) {
	  forwardTo.squeeze(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String grow() throws RemoteException{
	  return forwardTo.grow();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void grow(final BAsyncResult<String> asyncResult) {
	  forwardTo.grow(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String pick(byps.test.api.auth.SessionInfo sess, java.lang.String fromTree) throws RemoteException{
	  return forwardTo.pick(sess, fromTree);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void pick(byps.test.api.auth.SessionInfo sess, java.lang.String fromTree, final BAsyncResult<String> asyncResult) {
	  forwardTo.pick(sess, fromTree, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public boolean certify(java.lang.String param) throws RemoteException{
	  return forwardTo.certify(param);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void certify(java.lang.String param, final BAsyncResult<Boolean> asyncResult) {
	  forwardTo.certify(param, asyncResult);
	}
	
	
}

package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteProxy DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a proxy implementation of the interface BioFruitService.
 */
@SuppressWarnings("all")
public class BProxy_BioFruitService extends BSkeleton_BioFruitService implements BioFruitServiceAsync {
	
	public static final long serialVersionUID = 363642571L;
	
	protected final byps.test.api.inherit.BioFruitServiceAsync forwardTo;
	
	public BProxy_BioFruitService(BioFruitServiceAsync forwardTo) {
		this.forwardTo = forwardTo;
	}
	
	public BProxy_BioFruitService(BTransport transport) {
		this(new BForward_BioFruitService(transport));
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
	public boolean certify(java.lang.String param) throws RemoteException{
	  return forwardTo.certify(param);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void certify(java.lang.String param, final BAsyncResult<Boolean> asyncResult) {
	  forwardTo.certify(param, asyncResult);
	}
	
	
}
package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_BioFruitService extends BStub implements BioFruitServiceAuth, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 363642571L;
	protected final BForward_BioFruitService forwardTo;	
	
	@SuppressWarnings("unused") private BStub_BioFruitService() {
		this.forwardTo = new BForward_BioFruitService();
	}
	
	public BStub_BioFruitService(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_BioFruitService(transport);
		
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

package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_RemoteProcessingEx extends BStub implements RemoteProcessingExAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 790485113L;
	protected final BForward_RemoteProcessingEx forwardTo;	
	
	@SuppressWarnings("unused") private BStub_RemoteProcessingEx() {
		this.forwardTo = new BForward_RemoteProcessingEx();
	}
	
	public BStub_RemoteProcessingEx(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_RemoteProcessingEx(transport);
		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public boolean getValueAfterProcessingExceptions(int sleepSeconds) throws RemoteException{
	  return forwardTo.getValueAfterProcessingExceptions(sleepSeconds);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getValueAfterProcessingExceptions(int sleepSeconds, final BAsyncResult<Boolean> asyncResult) {
	  forwardTo.getValueAfterProcessingExceptions(sleepSeconds, asyncResult);
	}
	
	
}

package byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_ClientIF extends BStub implements ClientIFAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 2049072174L;
	protected final BForward_ClientIF forwardTo;	
	
	@SuppressWarnings("unused") private BStub_ClientIF() {
		this.forwardTo = new BForward_ClientIF();
	}
	
	public BStub_ClientIF(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_ClientIF(transport);
		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int incrementInt(int a) throws RemoteException{
	  return forwardTo.incrementInt(a);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void incrementInt(int a, final BAsyncResult<Integer> asyncResult) {
	  forwardTo.incrementInt(a, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.util.List<java.io.InputStream> getStreams(int ctrl) throws RemoteException{
	  return forwardTo.getStreams(ctrl);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getStreams(int ctrl, final BAsyncResult<java.util.List<java.io.InputStream>> asyncResult) {
	  forwardTo.getStreams(ctrl, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl) throws RemoteException{
	  forwardTo.putStreams(strm, ctrl);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl, final BAsyncResult<Object> asyncResult) {
	  forwardTo.putStreams(strm, ctrl, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public ChatStructure sendChat(ChatStructure cs) throws RemoteException{
	  return forwardTo.sendChat(cs);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void sendChat(ChatStructure cs, final BAsyncResult<ChatStructure> asyncResult) {
	  forwardTo.sendChat(cs, asyncResult);
	}
	
	
}

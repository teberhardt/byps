package byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_ServerIF extends BStub implements ServerIFAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 1775199834L;
	protected final BForward_ServerIF forwardTo;	
	
	@SuppressWarnings("unused") private BStub_ServerIF() {
		this.forwardTo = new BForward_ServerIF();
	}
	
	public BStub_ServerIF(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_ServerIF(transport);
		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int callClientIncrementInt(int v) throws RemoteException{
	  return forwardTo.callClientIncrementInt(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void callClientIncrementInt(int v, final BAsyncResult<Integer> asyncResult) {
	  forwardTo.callClientIncrementInt(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setPartner(ClientIF client) throws RemoteException{
	  forwardTo.setPartner(client);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setPartner(ClientIF client, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setPartner(client, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public ClientIF getPartner() throws RemoteException{
	  return forwardTo.getPartner();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getPartner(final BAsyncResult<ClientIF> asyncResult) {
	  forwardTo.getPartner(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.util.List<java.io.InputStream> getStreamsFromClient(boolean materializeOnServer) throws RemoteException{
	  return forwardTo.getStreamsFromClient(materializeOnServer);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getStreamsFromClient(boolean materializeOnServer, final BAsyncResult<java.util.List<java.io.InputStream>> asyncResult) {
	  forwardTo.getStreamsFromClient(materializeOnServer, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void putStreamsOnClient(java.util.List<java.io.InputStream> streams) throws RemoteException{
	  forwardTo.putStreamsOnClient(streams);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void putStreamsOnClient(java.util.List<java.io.InputStream> streams, final BAsyncResult<Object> asyncResult) {
	  forwardTo.putStreamsOnClient(streams, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void registerWithClientMap(int id) throws RemoteException{
	  forwardTo.registerWithClientMap(id);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void registerWithClientMap(int id, final BAsyncResult<Object> asyncResult) {
	  forwardTo.registerWithClientMap(id, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public ClientIF getClient(int id) throws RemoteException{
	  return forwardTo.getClient(id);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getClient(int id, final BAsyncResult<ClientIF> asyncResult) {
	  forwardTo.getClient(id, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.util.Set<java.lang.Integer> getClientIds() throws RemoteException{
	  return forwardTo.getClientIds();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getClientIds(final BAsyncResult<java.util.Set<java.lang.Integer>> asyncResult) {
	  forwardTo.getClientIds(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int callClientParallel(int v) throws RemoteException{
	  return forwardTo.callClientParallel(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void callClientParallel(int v, final BAsyncResult<Integer> asyncResult) {
	  forwardTo.callClientParallel(v, asyncResult);
	}
	
	
}

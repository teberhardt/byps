package byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface ClientIFAsync extends BRemote, 
	ClientIF {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:396
	public int incrementInt(int a) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:440
	public void incrementInt(int a, final BAsyncResult<Integer> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:396
	public java.util.List<java.io.InputStream> getStreams(int ctrl) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:440
	public void getStreams(int ctrl, final BAsyncResult<java.util.List<java.io.InputStream>> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:396
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:440
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl, final BAsyncResult<Object> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:396
	public ChatStructure sendChat(ChatStructure cs) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:440
	public void sendChat(ChatStructure cs, final BAsyncResult<ChatStructure> asyncResult) ;
	
	
}

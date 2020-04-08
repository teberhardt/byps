package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteForward DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteForward:145
public class BForward_RemoteStreams extends BStub implements RemoteStreamsAsync {
	
	protected BForward_RemoteStreams() {
	}
	
	public BForward_RemoteStreams(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.io.InputStream getImage() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		getImage(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getImage(final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getImage req = new BRequest_RemoteStreams_getImage();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setImage(java.io.InputStream istrm) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setImage(istrm, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setImage(java.io.InputStream istrm, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_setImage req = new BRequest_RemoteStreams_setImage();		
		req.istrm = istrm;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.util.TreeMap<java.lang.Integer,java.io.InputStream> getImages() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.util.TreeMap<java.lang.Integer,java.io.InputStream>> asyncResult = new BSyncResult<java.util.TreeMap<java.lang.Integer,java.io.InputStream>>();		
		getImages(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getImages(final BAsyncResult<java.util.TreeMap<java.lang.Integer,java.io.InputStream>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getImages req = new BRequest_RemoteStreams_getImages();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setImages(java.util.Map<java.lang.Integer,java.io.InputStream> istrms, int doNotReadStreamAtKey) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setImages(istrms, doNotReadStreamAtKey, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setImages(java.util.Map<java.lang.Integer,java.io.InputStream> istrms, int doNotReadStreamAtKey, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_setImages req = new BRequest_RemoteStreams_setImages();		
		req.istrms = istrms;
		req.doNotReadStreamAtKey = doNotReadStreamAtKey;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void throwLastException() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		throwLastException(asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void throwLastException(final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_throwLastException req = new BRequest_RemoteStreams_throwLastException();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.io.InputStream getTextStream() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		getTextStream(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getTextStream(final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getTextStream req = new BRequest_RemoteStreams_getTextStream();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.io.InputStream getVideoCheckSupportByteRange() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		getVideoCheckSupportByteRange(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getVideoCheckSupportByteRange(final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getVideoCheckSupportByteRange req = new BRequest_RemoteStreams_getVideoCheckSupportByteRange();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.io.InputStream getStreamDeferedProperies() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		getStreamDeferedProperies(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getStreamDeferedProperies(final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getStreamDeferedProperies req = new BRequest_RemoteStreams_getStreamDeferedProperies();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setStreamDoNotMaterialize(java.io.InputStream stream) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setStreamDoNotMaterialize(stream, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setStreamDoNotMaterialize(java.io.InputStream stream, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_setStreamDoNotMaterialize req = new BRequest_RemoteStreams_setStreamDoNotMaterialize();		
		req.stream = stream;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.io.InputStream getStreamDoNotClone() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<java.io.InputStream> asyncResult = new BSyncResult<java.io.InputStream>();		
		getStreamDoNotClone(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getStreamDoNotClone(final BAsyncResult<java.io.InputStream> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteStreams_getStreamDoNotClone req = new BRequest_RemoteStreams_getStreamDoNotClone();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}

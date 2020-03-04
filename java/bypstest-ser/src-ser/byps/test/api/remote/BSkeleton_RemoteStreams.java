package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteStreams.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteStreams extends BSkeleton implements RemoteStreamsAsync {
	
	public static final long serialVersionUID = 1043578866L;
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.io.InputStream getImage() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getImage(final BAsyncResult<java.io.InputStream> asyncResult) {
		try {
			java.io.InputStream ret = getImage();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setImage(java.io.InputStream istrm) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setImage(java.io.InputStream istrm, final BAsyncResult<Object> asyncResult) {
		try {
			setImage(istrm);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.TreeMap<java.lang.Integer,java.io.InputStream> getImages() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getImages(final BAsyncResult<java.util.TreeMap<java.lang.Integer,java.io.InputStream>> asyncResult) {
		try {
			java.util.TreeMap<java.lang.Integer,java.io.InputStream> ret = getImages();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setImages(java.util.Map<java.lang.Integer,java.io.InputStream> istrms, int doNotReadStreamAtKey) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setImages(java.util.Map<java.lang.Integer,java.io.InputStream> istrms, int doNotReadStreamAtKey, final BAsyncResult<Object> asyncResult) {
		try {
			setImages(istrms, doNotReadStreamAtKey);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void throwLastException() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void throwLastException(final BAsyncResult<Object> asyncResult) {
		try {
			throwLastException();
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.io.InputStream getTextStream() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getTextStream(final BAsyncResult<java.io.InputStream> asyncResult) {
		try {
			java.io.InputStream ret = getTextStream();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.io.InputStream getVideoCheckSupportByteRange() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getVideoCheckSupportByteRange(final BAsyncResult<java.io.InputStream> asyncResult) {
		try {
			java.io.InputStream ret = getVideoCheckSupportByteRange();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.io.InputStream getStreamDeferedProperies() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getStreamDeferedProperies(final BAsyncResult<java.io.InputStream> asyncResult) {
		try {
			java.io.InputStream ret = getStreamDeferedProperies();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setStreamDoNotMaterialize(java.io.InputStream stream) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setStreamDoNotMaterialize(java.io.InputStream stream, final BAsyncResult<Object> asyncResult) {
		try {
			setStreamDoNotMaterialize(stream);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.io.InputStream getStreamDoNotClone() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getStreamDoNotClone(final BAsyncResult<java.io.InputStream> asyncResult) {
		try {
			java.io.InputStream ret = getStreamDoNotClone();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}

package byps.ureq;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface BUtilityRequests.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_BUtilityRequests extends BSkeleton implements BUtilityRequestsAsync {
	
	public final static long serialVersionUID = 174367442L;
	
	// checkpoint byps.gen.j.PrintContext:365
	public void cancelMessage(long messageId) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void cancelMessage(long messageId, final BAsyncResult<Object> asyncResult) {
		try {
			cancelMessage(messageId);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.String> testAdapter(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void testAdapter(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params, final BAsyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult) {
		try {
			java.util.Map<java.lang.String,java.lang.String> ret = testAdapter(functionName, params);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.String> execute(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void execute(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params, final BAsyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult) {
		try {
			java.util.Map<java.lang.String,java.lang.String> ret = execute(functionName, params);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
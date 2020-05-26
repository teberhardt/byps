package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteForward DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteForward:145
public class BForward_RemoteWithAuthentication extends BStub implements RemoteWithAuthenticationAsync {
	
	protected BForward_RemoteWithAuthentication() {
	}
	
	public BForward_RemoteWithAuthentication(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setUseAuthentication(boolean useAuth) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setUseAuthentication(useAuth, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setUseAuthentication(boolean useAuth, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteWithAuthentication_setUseAuthentication req = new BRequest_RemoteWithAuthentication_setUseAuthentication();		
		req.useAuth = useAuth;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public byps.test.api.auth.SessionInfo login(byps.test.api.auth.SessionInfo sess, java.lang.String userName, java.lang.String userPwd) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<byps.test.api.auth.SessionInfo> asyncResult = new BSyncResult<byps.test.api.auth.SessionInfo>();		
		login(sess, userName, userPwd, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void login(byps.test.api.auth.SessionInfo sess, java.lang.String userName, java.lang.String userPwd, final BAsyncResult<byps.test.api.auth.SessionInfo> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteWithAuthentication_login req = new BRequest_RemoteWithAuthentication_login();		
		req.sess = sess;
		req.userName = userName;
		req.userPwd = userPwd;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int doit(byps.test.api.auth.SessionInfo sess, int value) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Integer> asyncResult = new BSyncResult<Integer>();		
		doit(sess, value, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void doit(byps.test.api.auth.SessionInfo sess, int value, final BAsyncResult<Integer> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteWithAuthentication_doit req = new BRequest_RemoteWithAuthentication_doit();		
		req.sess = sess;
		req.value = value;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void expire(byps.test.api.auth.SessionInfo sess) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		expire(sess, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void expire(byps.test.api.auth.SessionInfo sess, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteWithAuthentication_expire req = new BRequest_RemoteWithAuthentication_expire();		
		req.sess = sess;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setReloginCount(int count) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setReloginCount(count, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setReloginCount(int count, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteWithAuthentication_setReloginCount req = new BRequest_RemoteWithAuthentication_setReloginCount();		
		req.count = count;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
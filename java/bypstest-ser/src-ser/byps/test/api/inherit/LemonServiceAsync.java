package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface LemonServiceAsync extends BRemote, 
	LemonService, 
	byps.test.api.inherit.FruitServiceAsync {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String pick(byps.test.api.auth.SessionInfo sess, java.lang.String fromTree) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:442
	public void pick(byps.test.api.auth.SessionInfo sess, java.lang.String fromTree, final BAsyncResult<String> asyncResult) ;
	
	
}

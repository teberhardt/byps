package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAuth DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface BioFruitServiceAuth extends BRemote, 
	byps.test.api.inherit.FruitServiceAuth {
	/**
	 * @since 1
	*/
	// checkpoint byps.gen.j.PrintContext:396
	public boolean certify(java.lang.String param) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:440
	public void certify(java.lang.String param, final BAsyncResult<Boolean> asyncResult) ;
	
	
}

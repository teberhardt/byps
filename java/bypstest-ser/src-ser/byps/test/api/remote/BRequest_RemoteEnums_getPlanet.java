package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteEnums_getPlanet extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 6352043L;
	
	public int getRemoteId() { return 1222673152; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteEnumsAsync __byps__remoteT = (RemoteEnumsAsync)__byps__remote;			
			BAsyncResultSendMethod<byps.test.api.enu.EnumPlanets> __byps__outerResult = new BAsyncResultSendMethod<byps.test.api.enu.EnumPlanets>(__byps__asyncResult, new byps.test.api.BResult_1375035164());			
			__byps__remoteT.getPlanet(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}

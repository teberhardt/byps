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
public final class BRequest_RemoteInlineInstance_getPoint2DList extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1428313263L;
	
	public int getRemoteId() { return 567395951; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteInlineInstanceAsync __byps__remoteT = (RemoteInlineInstanceAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<byps.test.api.inl.Point2D>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<byps.test.api.inl.Point2D>>(__byps__asyncResult, new byps.test.api.BResult_2064980445());			
			__byps__remoteT.getPoint2DList(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteInlineInstance.getPoint2DList(");
		s.append(")]");
		return s.toString();
	}
	
}

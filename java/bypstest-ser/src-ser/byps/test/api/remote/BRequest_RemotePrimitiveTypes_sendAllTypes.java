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
public final class BRequest_RemotePrimitiveTypes_sendAllTypes extends BMethodRequest implements Serializable {

	public boolean b;
	public char c;
	public short s;
	public int i;
	public long l;
	public float f;
	public double d;
	public java.lang.String str;
	public byps.test.api.prim.PrimitiveTypes pt;
	public java.lang.Object o;
	
	public final static long serialVersionUID = 677876863L;
	
	public int getRemoteId() { return 1178916877; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemotePrimitiveTypesAsync __byps__remoteT = (RemotePrimitiveTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new byps.test.api.BResult_19());			
			__byps__remoteT.sendAllTypes(b, c, s, i, l, f, d, str, pt, o, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemotePrimitiveTypes.sendAllTypes(");
		s.append(b);
		s.append(",").append(c);
		s.append(",").append(s);
		s.append(",").append(i);
		s.append(",").append(l);
		s.append(",").append(f);
		s.append(",").append(d);
		s.append(",").append(str);
		s.append(",").append(pt);
		s.append(",").append(o);
		s.append(")]");
		return s.toString();
	}
	
}

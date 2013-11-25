package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteArrayTypes23 extends BStub implements RemoteArrayTypes23Async, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 964138163L;
	
	public BStub_RemoteArrayTypes23(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public int[] sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<int[]> asyncResult = new BSyncResult<int[]>();		
		sendArraysInt(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4, final BAsyncResult<int[]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes23_sendArraysInt req = new BRequest_RemoteArrayTypes23_sendArraysInt();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String[] sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.String[]> asyncResult = new BSyncResult<java.lang.String[]>();		
		sendArraysString(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4, final BAsyncResult<java.lang.String[]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes23_sendArraysString req = new BRequest_RemoteArrayTypes23_sendArraysString();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.prim.PrimitiveTypes[] sendArraysClass(byps.test.api.prim.PrimitiveTypes[][] arr2, byps.test.api.prim.PrimitiveTypes[][][] arr3, byps.test.api.prim.PrimitiveTypes[][][][] arr4) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<byps.test.api.prim.PrimitiveTypes[]> asyncResult = new BSyncResult<byps.test.api.prim.PrimitiveTypes[]>();		
		sendArraysClass(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysClass(byps.test.api.prim.PrimitiveTypes[][] arr2, byps.test.api.prim.PrimitiveTypes[][][] arr3, byps.test.api.prim.PrimitiveTypes[][][][] arr4, final BAsyncResult<byps.test.api.prim.PrimitiveTypes[]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes23_sendArraysClass req = new BRequest_RemoteArrayTypes23_sendArraysClass();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.Object[] sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.Object[]> asyncResult = new BSyncResult<java.lang.Object[]>();		
		sendArraysObject(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4, final BAsyncResult<java.lang.Object[]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes23_sendArraysObject req = new BRequest_RemoteArrayTypes23_sendArraysObject();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.inl.Point2D[] sendArraysInline(byps.test.api.inl.Point2D[][] arr2, byps.test.api.inl.Point2D[][][] arr3, byps.test.api.inl.Point2D[][][][] arr4) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<byps.test.api.inl.Point2D[]> asyncResult = new BSyncResult<byps.test.api.inl.Point2D[]>();		
		sendArraysInline(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysInline(byps.test.api.inl.Point2D[][] arr2, byps.test.api.inl.Point2D[][][] arr3, byps.test.api.inl.Point2D[][][][] arr4, final BAsyncResult<byps.test.api.inl.Point2D[]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes23_sendArraysInline req = new BRequest_RemoteArrayTypes23_sendArraysInline();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		transport.sendMethod(req, asyncResult);
	}
	
	
}

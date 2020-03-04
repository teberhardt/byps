package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteInlineInstance.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteInlineInstance extends BSkeleton implements RemoteInlineInstanceAsync {
	
	public static final long serialVersionUID = 567395951L;
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setActor(byps.test.api.inl.Actor act) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setActor(byps.test.api.inl.Actor act, final BAsyncResult<Object> asyncResult) {
		try {
			setActor(act);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public byps.test.api.inl.Actor getActor() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getActor(final BAsyncResult<byps.test.api.inl.Actor> asyncResult) {
		try {
			byps.test.api.inl.Actor ret = getActor();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPoint2DArray1dim(byps.test.api.inl.Point2D[] pointArray) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPoint2DArray1dim(byps.test.api.inl.Point2D[] pointArray, final BAsyncResult<Object> asyncResult) {
		try {
			setPoint2DArray1dim(pointArray);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public byps.test.api.inl.Point2D[] getPoint2DArray1dim() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPoint2DArray1dim(final BAsyncResult<byps.test.api.inl.Point2D[]> asyncResult) {
		try {
			byps.test.api.inl.Point2D[] ret = getPoint2DArray1dim();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPoint2DArray4dim(byps.test.api.inl.Point2D[][][][] pointArray) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPoint2DArray4dim(byps.test.api.inl.Point2D[][][][] pointArray, final BAsyncResult<Object> asyncResult) {
		try {
			setPoint2DArray4dim(pointArray);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public byps.test.api.inl.Point2D[][][][] getPoint2DArray4dim() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPoint2DArray4dim(final BAsyncResult<byps.test.api.inl.Point2D[][][][]> asyncResult) {
		try {
			byps.test.api.inl.Point2D[][][][] ret = getPoint2DArray4dim();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPoint2DList(java.util.List<byps.test.api.inl.Point2D> pointList) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPoint2DList(java.util.List<byps.test.api.inl.Point2D> pointList, final BAsyncResult<Object> asyncResult) {
		try {
			setPoint2DList(pointList);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<byps.test.api.inl.Point2D> getPoint2DList() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPoint2DList(final BAsyncResult<java.util.List<byps.test.api.inl.Point2D>> asyncResult) {
		try {
			java.util.List<byps.test.api.inl.Point2D> ret = getPoint2DList();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPoint2DListList(java.util.List<java.util.List<byps.test.api.inl.Point2D>> pointListList) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPoint2DListList(java.util.List<java.util.List<byps.test.api.inl.Point2D>> pointListList, final BAsyncResult<Object> asyncResult) {
		try {
			setPoint2DListList(pointListList);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.util.List<byps.test.api.inl.Point2D>> getPoint2DListList() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPoint2DListList(final BAsyncResult<java.util.List<java.util.List<byps.test.api.inl.Point2D>>> asyncResult) {
		try {
			java.util.List<java.util.List<byps.test.api.inl.Point2D>> ret = getPoint2DListList();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPoint2DMap(java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D> pointMap) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPoint2DMap(java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D> pointMap, final BAsyncResult<Object> asyncResult) {
		try {
			setPoint2DMap(pointMap);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D> getPoint2DMap() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPoint2DMap(final BAsyncResult<java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D>> asyncResult) {
		try {
			java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D> ret = getPoint2DMap();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}

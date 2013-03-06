﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

public class BStub_RemoteArrayTypes1dim extends BStub implements RemoteArrayTypes1dim, java.io.Serializable {
	
	public final static long serialVersionUID = 1557084481L;
	
	public BStub_RemoteArrayTypes1dim(final BTransport transport) {
		super(transport);		
	}
	
	public void setBool(boolean[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setBool(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setBool(boolean[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setBool req = new BRequest_RemoteArrayTypes1dim_setBool();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setByte(byte[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setByte(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setByte(byte[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setByte req = new BRequest_RemoteArrayTypes1dim_setByte();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setChar(char[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setChar(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setChar(char[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setChar req = new BRequest_RemoteArrayTypes1dim_setChar();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setShort(short[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setShort(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setShort(short[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setShort req = new BRequest_RemoteArrayTypes1dim_setShort();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setInt(int[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setInt(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setInt(int[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setInt req = new BRequest_RemoteArrayTypes1dim_setInt();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setLong(long[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setLong(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setLong(long[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setLong req = new BRequest_RemoteArrayTypes1dim_setLong();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setFloat(float[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setFloat(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setFloat(float[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setFloat req = new BRequest_RemoteArrayTypes1dim_setFloat();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setDouble(double[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setDouble(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setDouble(double[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setDouble req = new BRequest_RemoteArrayTypes1dim_setDouble();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setString(java.lang.String[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setString(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setString(java.lang.String[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setString req = new BRequest_RemoteArrayTypes1dim_setString();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setPrimitiveTypes(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setPrimitiveTypes req = new BRequest_RemoteArrayTypes1dim_setPrimitiveTypes();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public void setObject(java.lang.Object[] v) throws BException, InterruptedException {
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setObject(v, asyncResult);
		asyncResult.getResult();		
	}
	public void async_setObject(java.lang.Object[] v, final BAsyncResult<Object> asyncResult) {
		BRequest_RemoteArrayTypes1dim_setObject req = new BRequest_RemoteArrayTypes1dim_setObject();		
		req.v = v;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public boolean[] getBool() throws BException, InterruptedException {
		final BSyncResult<boolean[]> asyncResult = new BSyncResult<boolean[]>();		
		async_getBool(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getBool(final BAsyncResult<boolean[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getBool req = new BRequest_RemoteArrayTypes1dim_getBool();		
		BAsyncResultReceiveMethod<boolean[]> outerResult = new BAsyncResultReceiveMethod<boolean[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public byte[] getByte() throws BException, InterruptedException {
		final BSyncResult<byte[]> asyncResult = new BSyncResult<byte[]>();		
		async_getByte(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getByte(final BAsyncResult<byte[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getByte req = new BRequest_RemoteArrayTypes1dim_getByte();		
		BAsyncResultReceiveMethod<byte[]> outerResult = new BAsyncResultReceiveMethod<byte[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public char[] getChar() throws BException, InterruptedException {
		final BSyncResult<char[]> asyncResult = new BSyncResult<char[]>();		
		async_getChar(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getChar(final BAsyncResult<char[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getChar req = new BRequest_RemoteArrayTypes1dim_getChar();		
		BAsyncResultReceiveMethod<char[]> outerResult = new BAsyncResultReceiveMethod<char[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public short[] getShort() throws BException, InterruptedException {
		final BSyncResult<short[]> asyncResult = new BSyncResult<short[]>();		
		async_getShort(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getShort(final BAsyncResult<short[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getShort req = new BRequest_RemoteArrayTypes1dim_getShort();		
		BAsyncResultReceiveMethod<short[]> outerResult = new BAsyncResultReceiveMethod<short[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public int[] getInt() throws BException, InterruptedException {
		final BSyncResult<int[]> asyncResult = new BSyncResult<int[]>();		
		async_getInt(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getInt(final BAsyncResult<int[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getInt req = new BRequest_RemoteArrayTypes1dim_getInt();		
		BAsyncResultReceiveMethod<int[]> outerResult = new BAsyncResultReceiveMethod<int[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public long[] getLong() throws BException, InterruptedException {
		final BSyncResult<long[]> asyncResult = new BSyncResult<long[]>();		
		async_getLong(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getLong(final BAsyncResult<long[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getLong req = new BRequest_RemoteArrayTypes1dim_getLong();		
		BAsyncResultReceiveMethod<long[]> outerResult = new BAsyncResultReceiveMethod<long[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public float[] getFloat() throws BException, InterruptedException {
		final BSyncResult<float[]> asyncResult = new BSyncResult<float[]>();		
		async_getFloat(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getFloat(final BAsyncResult<float[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getFloat req = new BRequest_RemoteArrayTypes1dim_getFloat();		
		BAsyncResultReceiveMethod<float[]> outerResult = new BAsyncResultReceiveMethod<float[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public double[] getDouble() throws BException, InterruptedException {
		final BSyncResult<double[]> asyncResult = new BSyncResult<double[]>();		
		async_getDouble(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getDouble(final BAsyncResult<double[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getDouble req = new BRequest_RemoteArrayTypes1dim_getDouble();		
		BAsyncResultReceiveMethod<double[]> outerResult = new BAsyncResultReceiveMethod<double[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public java.lang.String[] getString() throws BException, InterruptedException {
		final BSyncResult<java.lang.String[]> asyncResult = new BSyncResult<java.lang.String[]>();		
		async_getString(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getString(final BAsyncResult<java.lang.String[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getString req = new BRequest_RemoteArrayTypes1dim_getString();		
		BAsyncResultReceiveMethod<java.lang.String[]> outerResult = new BAsyncResultReceiveMethod<java.lang.String[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public com.wilutions.byps.test.api.prim.PrimitiveTypes[] getPrimitiveTypes() throws BException, InterruptedException {
		final BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]>();		
		async_getPrimitiveTypes(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getPrimitiveTypes(final BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getPrimitiveTypes req = new BRequest_RemoteArrayTypes1dim_getPrimitiveTypes();		
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public java.lang.Object[] getObject() throws BException, InterruptedException {
		final BSyncResult<java.lang.Object[]> asyncResult = new BSyncResult<java.lang.Object[]>();		
		async_getObject(asyncResult);
		return asyncResult.getResult();		
	}
	public void async_getObject(final BAsyncResult<java.lang.Object[]> asyncResult) {
		BRequest_RemoteArrayTypes1dim_getObject req = new BRequest_RemoteArrayTypes1dim_getObject();		
		BAsyncResultReceiveMethod<java.lang.Object[]> outerResult = new BAsyncResultReceiveMethod<java.lang.Object[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}

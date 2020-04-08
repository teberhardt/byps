package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_RemoteArrayTypes1dim extends BStub implements RemoteArrayTypes1dimAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 123123L;
	protected final BForward_RemoteArrayTypes1dim forwardTo;	
	
	@SuppressWarnings("unused") private BStub_RemoteArrayTypes1dim() {
		this.forwardTo = new BForward_RemoteArrayTypes1dim();
	}
	
	public BStub_RemoteArrayTypes1dim(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_RemoteArrayTypes1dim(transport);
		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setBool(boolean[] v) throws RemoteException{
	  forwardTo.setBool(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setBool(boolean[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setBool(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setByte(byte[] v) throws RemoteException{
	  forwardTo.setByte(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setByte(byte[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setByte(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setChar(char[] v) throws RemoteException{
	  forwardTo.setChar(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setChar(char[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setChar(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setShort(short[] v) throws RemoteException{
	  forwardTo.setShort(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setShort(short[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setShort(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setInt(int[] v) throws RemoteException{
	  forwardTo.setInt(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setInt(int[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setInt(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setLong(long[] v) throws RemoteException{
	  forwardTo.setLong(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setLong(long[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setLong(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setFloat(float[] v) throws RemoteException{
	  forwardTo.setFloat(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setFloat(float[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setFloat(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setDouble(double[] v) throws RemoteException{
	  forwardTo.setDouble(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setDouble(double[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setDouble(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setString(java.lang.String[] v) throws RemoteException{
	  forwardTo.setString(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setString(java.lang.String[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setString(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setPrimitiveTypes(byps.test.api.prim.PrimitiveTypes[] v) throws RemoteException{
	  forwardTo.setPrimitiveTypes(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setPrimitiveTypes(byps.test.api.prim.PrimitiveTypes[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setPrimitiveTypes(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setObject(java.lang.Object[] v) throws RemoteException{
	  forwardTo.setObject(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setObject(java.lang.Object[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setObject(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void setDate(java.util.Date[] v) throws RemoteException{
	  forwardTo.setDate(v);
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void setDate(java.util.Date[] v, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setDate(v, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public boolean[] getBool() throws RemoteException{
	  return forwardTo.getBool();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getBool(final BAsyncResult<boolean[]> asyncResult) {
	  forwardTo.getBool(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public byte[] getByte() throws RemoteException{
	  return forwardTo.getByte();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getByte(final BAsyncResult<byte[]> asyncResult) {
	  forwardTo.getByte(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public char[] getChar() throws RemoteException{
	  return forwardTo.getChar();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getChar(final BAsyncResult<char[]> asyncResult) {
	  forwardTo.getChar(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public short[] getShort() throws RemoteException{
	  return forwardTo.getShort();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getShort(final BAsyncResult<short[]> asyncResult) {
	  forwardTo.getShort(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public int[] getInt() throws RemoteException{
	  return forwardTo.getInt();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getInt(final BAsyncResult<int[]> asyncResult) {
	  forwardTo.getInt(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public long[] getLong() throws RemoteException{
	  return forwardTo.getLong();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getLong(final BAsyncResult<long[]> asyncResult) {
	  forwardTo.getLong(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public float[] getFloat() throws RemoteException{
	  return forwardTo.getFloat();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getFloat(final BAsyncResult<float[]> asyncResult) {
	  forwardTo.getFloat(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public double[] getDouble() throws RemoteException{
	  return forwardTo.getDouble();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getDouble(final BAsyncResult<double[]> asyncResult) {
	  forwardTo.getDouble(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.String[] getString() throws RemoteException{
	  return forwardTo.getString();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getString(final BAsyncResult<java.lang.String[]> asyncResult) {
	  forwardTo.getString(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public byps.test.api.prim.PrimitiveTypes[] getPrimitiveTypes() throws RemoteException{
	  return forwardTo.getPrimitiveTypes();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getPrimitiveTypes(final BAsyncResult<byps.test.api.prim.PrimitiveTypes[]> asyncResult) {
	  forwardTo.getPrimitiveTypes(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.lang.Object[] getObject() throws RemoteException{
	  return forwardTo.getObject();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getObject(final BAsyncResult<java.lang.Object[]> asyncResult) {
	  forwardTo.getObject(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public java.util.Date[] getDate() throws RemoteException{
	  return forwardTo.getDate();
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void getDate(final BAsyncResult<java.util.Date[]> asyncResult) {
	  forwardTo.getDate(asyncResult);
	}
	
	
}

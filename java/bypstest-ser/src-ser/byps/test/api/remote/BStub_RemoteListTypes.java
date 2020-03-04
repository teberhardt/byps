package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:112
public class BStub_RemoteListTypes extends BStub implements RemoteListTypesAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:93
	public static final long serialVersionUID = 1233438138L;
	protected final BForward_RemoteListTypes forwardTo;	
	
	@SuppressWarnings("unused") private BStub_RemoteListTypes() {
		this.forwardTo = new BForward_RemoteListTypes();
	}
	
	public BStub_RemoteListTypes(final BTransport transport) {
		super(transport);
		this.forwardTo = new BForward_RemoteListTypes(transport);
		
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Boolean> getBoolean1() throws RemoteException{
	  return forwardTo.getBoolean1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getBoolean1(final BAsyncResult<java.util.List<java.lang.Boolean>> asyncResult) {
	  forwardTo.getBoolean1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setBoolean1(java.util.List<java.lang.Boolean> boolean1) throws RemoteException{
	  forwardTo.setBoolean1(boolean1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setBoolean1(java.util.List<java.lang.Boolean> boolean1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setBoolean1(boolean1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Byte> getByte1() throws RemoteException{
	  return forwardTo.getByte1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getByte1(final BAsyncResult<java.util.List<java.lang.Byte>> asyncResult) {
	  forwardTo.getByte1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setByte1(java.util.List<java.lang.Byte> byte1) throws RemoteException{
	  forwardTo.setByte1(byte1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setByte1(java.util.List<java.lang.Byte> byte1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setByte1(byte1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Character> getChar1() throws RemoteException{
	  return forwardTo.getChar1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getChar1(final BAsyncResult<java.util.List<java.lang.Character>> asyncResult) {
	  forwardTo.getChar1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setChar1(java.util.List<java.lang.Character> char1) throws RemoteException{
	  forwardTo.setChar1(char1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setChar1(java.util.List<java.lang.Character> char1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setChar1(char1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Short> getShort1() throws RemoteException{
	  return forwardTo.getShort1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getShort1(final BAsyncResult<java.util.List<java.lang.Short>> asyncResult) {
	  forwardTo.getShort1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setShort1(java.util.List<java.lang.Short> short1) throws RemoteException{
	  forwardTo.setShort1(short1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setShort1(java.util.List<java.lang.Short> short1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setShort1(short1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Integer> getInt1() throws RemoteException{
	  return forwardTo.getInt1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getInt1(final BAsyncResult<java.util.List<java.lang.Integer>> asyncResult) {
	  forwardTo.getInt1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setInt1(java.util.List<java.lang.Integer> int1) throws RemoteException{
	  forwardTo.setInt1(int1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setInt1(java.util.List<java.lang.Integer> int1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setInt1(int1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Long> getLong1() throws RemoteException{
	  return forwardTo.getLong1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getLong1(final BAsyncResult<java.util.List<java.lang.Long>> asyncResult) {
	  forwardTo.getLong1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setLong1(java.util.List<java.lang.Long> long1) throws RemoteException{
	  forwardTo.setLong1(long1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setLong1(java.util.List<java.lang.Long> long1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setLong1(long1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Float> getFloat1() throws RemoteException{
	  return forwardTo.getFloat1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getFloat1(final BAsyncResult<java.util.List<java.lang.Float>> asyncResult) {
	  forwardTo.getFloat1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setFloat1(java.util.List<java.lang.Float> float1) throws RemoteException{
	  forwardTo.setFloat1(float1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setFloat1(java.util.List<java.lang.Float> float1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setFloat1(float1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Double> getDouble1() throws RemoteException{
	  return forwardTo.getDouble1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getDouble1(final BAsyncResult<java.util.List<java.lang.Double>> asyncResult) {
	  forwardTo.getDouble1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setDouble1(java.util.List<java.lang.Double> double1) throws RemoteException{
	  forwardTo.setDouble1(double1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setDouble1(java.util.List<java.lang.Double> double1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setDouble1(double1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.String> getString1() throws RemoteException{
	  return forwardTo.getString1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getString1(final BAsyncResult<java.util.List<java.lang.String>> asyncResult) {
	  forwardTo.getString1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setString1(java.util.List<java.lang.String> string1) throws RemoteException{
	  forwardTo.setString1(string1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setString1(java.util.List<java.lang.String> string1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setString1(string1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<byps.test.api.prim.PrimitiveTypes> getPrimitiveTypes1() throws RemoteException{
	  return forwardTo.getPrimitiveTypes1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getPrimitiveTypes1(final BAsyncResult<java.util.List<byps.test.api.prim.PrimitiveTypes>> asyncResult) {
	  forwardTo.getPrimitiveTypes1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setPrimitiveTypes1(java.util.List<byps.test.api.prim.PrimitiveTypes> primitiveTypes1) throws RemoteException{
	  forwardTo.setPrimitiveTypes1(primitiveTypes1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setPrimitiveTypes1(java.util.List<byps.test.api.prim.PrimitiveTypes> primitiveTypes1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setPrimitiveTypes1(primitiveTypes1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<byte[]> getByte2() throws RemoteException{
	  return forwardTo.getByte2();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getByte2(final BAsyncResult<java.util.List<byte[]>> asyncResult) {
	  forwardTo.getByte2(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setByte2(java.util.List<byte[]> byte2) throws RemoteException{
	  forwardTo.setByte2(byte2);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setByte2(java.util.List<byte[]> byte2, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setByte2(byte2, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<int[]> getInt2() throws RemoteException{
	  return forwardTo.getInt2();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getInt2(final BAsyncResult<java.util.List<int[]>> asyncResult) {
	  forwardTo.getInt2(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setInt2(java.util.List<int[]> int2) throws RemoteException{
	  forwardTo.setInt2(int2);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setInt2(java.util.List<int[]> int2, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setInt2(int2, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.lang.Object> getObj1() throws RemoteException{
	  return forwardTo.getObj1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getObj1(final BAsyncResult<java.util.List<java.lang.Object>> asyncResult) {
	  forwardTo.getObj1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setObj1(java.util.List<java.lang.Object> obj1) throws RemoteException{
	  forwardTo.setObj1(obj1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setObj1(java.util.List<java.lang.Object> obj1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setObj1(obj1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setDate1(java.util.List<java.util.Date> obj1) throws RemoteException{
	  forwardTo.setDate1(obj1);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setDate1(java.util.List<java.util.Date> obj1, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setDate1(obj1, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.util.Date> getDate1() throws RemoteException{
	  return forwardTo.getDate1();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getDate1(final BAsyncResult<java.util.List<java.util.Date>> asyncResult) {
	  forwardTo.getDate1(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.util.List<java.lang.Integer>> getInt3() throws RemoteException{
	  return forwardTo.getInt3();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getInt3(final BAsyncResult<java.util.List<java.util.List<java.lang.Integer>>> asyncResult) {
	  forwardTo.getInt3(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setInt3(java.util.List<java.util.List<java.lang.Integer>> int3) throws RemoteException{
	  forwardTo.setInt3(int3);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setInt3(java.util.List<java.util.List<java.lang.Integer>> int3, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setInt3(int3, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>> getInt4() throws RemoteException{
	  return forwardTo.getInt4();
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void getInt4(final BAsyncResult<java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>>> asyncResult) {
	  forwardTo.getInt4(asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:385
	public void setInt4(java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>> int4) throws RemoteException{
	  forwardTo.setInt4(int4);
	}
	// checkpoint byps.gen.j.PrintContext:429
	public void setInt4(java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>> int4, final BAsyncResult<Object> asyncResult) {
	  forwardTo.setInt4(int4, asyncResult);
	}
	
	
}

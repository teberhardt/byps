package byps.test.api.remote;

import java.util.Date;

import byps.BRemote;
import byps.RemoteException;
import byps.test.api.prim.PrimitiveTypes;


/**
 */
public interface RemotePrimitiveTypes extends BRemote {

  public final static long serialVersionUID = 456456L;

	public void voidFunctionVoid() throws RemoteException;
	
	public void setBool(boolean v) throws RemoteException;
	public void setByte(byte v) throws RemoteException;
	public void setChar(char v) throws RemoteException;
	public void setShort(short v) throws RemoteException;
	public void setInt(int v) throws RemoteException;
	public void setLong(long v) throws RemoteException;
	public void setFloat(float v) throws RemoteException;
	public void setDouble(double v) throws RemoteException;
	public void setString(String v) throws RemoteException;
	public void setPrimitiveTypes(PrimitiveTypes v) throws RemoteException;
	public void setObject(Object v) throws RemoteException;
	public void setDate(Date v) throws RemoteException;

	public boolean getBool() throws RemoteException;
	public byte getByte() throws RemoteException;
	public char getChar() throws RemoteException;
	public short getShort() throws RemoteException;
	public int getInt() throws RemoteException;
	public long getLong() throws RemoteException;
	public float getFloat() throws RemoteException;
	public double getDouble() throws RemoteException;
	public String getString() throws RemoteException;
	public PrimitiveTypes getPrimitiveTypes() throws RemoteException;
	public Object getObject() throws RemoteException;
	public Date getDate() throws RemoteException;

	public void sendAllTypes(boolean b, char c, short s, int i, long l, float f, double d, String str, PrimitiveTypes pt, Object o) throws RemoteException;
	
	public int add(int a, int b) throws RemoteException;
	
	public Date makeDate(int year, int month, int day, int hour, int minute, int second, int millisecond) throws RemoteException;
	public int[] parseDate(Date date) throws RemoteException;
	
	public void throwException() throws RemoteException;
	
	public int getDeferredValueFromServer(int param1, String param2) throws RemoteException;
}
package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteForward DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteForward:145
public class BForward_RemoteConstants extends BStub implements RemoteConstantsAsync {
	
	protected BForward_RemoteConstants() {
	}
	
	public BForward_RemoteConstants(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public void compare_HebrewC(byps.test.api.cons.HebrewZ ALEPH, byps.test.api.cons.HebrewZ BETH) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		compare_HebrewC(ALEPH, BETH, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void compare_HebrewC(byps.test.api.cons.HebrewZ ALEPH, byps.test.api.cons.HebrewZ BETH, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteConstants_compare_HebrewC req = new BRequest_RemoteConstants_compare_HebrewC();		
		req.ALEPH = ALEPH;
		req.BETH = BETH;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:398
	public boolean compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, byps.test.api.cons.AllTypesZ[][] arrAll) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteForward:48
		final BSyncResult<Boolean> asyncResult = new BSyncResult<Boolean>();		
		compare_AllTypesC(bool1s, bool2s, char1s, stringNull, char2s, short1s, int1s, long1s, float1s, double1s, string1s, ALL, arrInt, arrInt4, arrStrings, arrStrings4, arrAll, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:442
	public void compare_AllTypesC(boolean bool1s, boolean bool2s, char char1s, java.lang.String stringNull, char char2s, short short1s, int int1s, long long1s, float float1s, double double1s, java.lang.String string1s, byps.test.api.cons.AllTypesZ ALL, int[] arrInt, int[][][][] arrInt4, java.lang.String[] arrStrings, java.lang.String[][][][] arrStrings4, byps.test.api.cons.AllTypesZ[][] arrAll, final BAsyncResult<Boolean> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteForward:109
		BRequest_RemoteConstants_compare_AllTypesC req = new BRequest_RemoteConstants_compare_AllTypesC();		
		req.bool1s = bool1s;
		req.bool2s = bool2s;
		req.char1s = char1s;
		req.stringNull = stringNull;
		req.char2s = char2s;
		req.short1s = short1s;
		req.int1s = int1s;
		req.long1s = long1s;
		req.float1s = float1s;
		req.double1s = double1s;
		req.string1s = string1s;
		req.ALL = ALL;
		req.arrInt = arrInt;
		req.arrInt4 = arrInt4;
		req.arrStrings = arrStrings;
		req.arrStrings4 = arrStrings4;
		req.arrAll = arrAll;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
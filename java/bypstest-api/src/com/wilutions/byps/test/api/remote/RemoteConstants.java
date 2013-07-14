package com.wilutions.byps.test.api.remote;

import com.wilutions.byps.BException;
import com.wilutions.byps.BRemote;
import com.wilutions.byps.test.api.cons.AllTypesZ;
import com.wilutions.byps.test.api.cons.HebrewZ;

/**
 * Interface functions to verify constant definitions.
 *
 */
public interface RemoteConstants extends BRemote {

	void compare_HebrewC(HebrewZ ALEPH, HebrewZ BETH) throws BException, InterruptedException;
	
	boolean compare_AllTypesC(
			boolean bool1s, 
			boolean bool2s,
			char char1s,
			String stringNull,
			char char2s,
			short short1s,
			int int1s,
			long long1s,
			float float1s,
			double double1s,
			String string1s,
			AllTypesZ ALL,
			int[] arrInt,
			int[][][][] arrInt4,
			String[] arrStrings,
			String[][][][] arrStrings4,
			AllTypesZ[][] arrAll) throws BException, InterruptedException;
}

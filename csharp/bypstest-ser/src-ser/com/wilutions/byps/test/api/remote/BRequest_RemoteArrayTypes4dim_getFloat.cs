﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteArrayTypes4dim_getFloat : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1557173854; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteArrayTypes4dim __byps__remoteT = (RemoteArrayTypes4dim)__byps__remote;				
				BAsyncResultSendMethod<float[,,,]> __byps__outerResult = new BAsyncResultSendMethod<float[,,,]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1516687588());				
				__byps__remoteT.async_GetFloat(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1402482290L;		
	} // end class
}  // end namespace
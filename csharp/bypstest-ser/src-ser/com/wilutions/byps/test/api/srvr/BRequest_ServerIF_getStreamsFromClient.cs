﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.srvr
{
	
	public sealed class BRequest_ServerIF_getStreamsFromClient : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1313562065; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				ServerIF __byps__remoteT = (ServerIF)__byps__remote;				
				BAsyncResultSendMethod<IList<System.IO.Stream>> __byps__outerResult = new BAsyncResultSendMethod<IList<System.IO.Stream>>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1218831438());				
				__byps__remoteT.async_GetStreamsFromClient(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1415283169L;		
	} // end class
}  // end namespace
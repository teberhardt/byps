﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.srvr
{
	
	public sealed class BRequest_ClientIF_incrementInt : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 955752991; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:406
			try {
				ClientIF __byps__remoteT = (ClientIF)__byps__remote;				
				BAsyncResultSendMethod<int> __byps__outerResult = new BAsyncResultSendMethod<int>(__byps__asyncResult, new byps.test.api.BResult_5());				
				__byps__remoteT.IncrementInt(aValue, BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(0, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal int aValue;

		#endregion
		
		
		public static readonly long serialVersionUID = 1685952420L;		
	} // end class
}  // end namespace

﻿//
// Serializer for byps.test.api.BResult_10
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BSerializer_534004421 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_534004421();
		
		public BSerializer_534004421()
			: base(534004421) {}
		
		public BSerializer_534004421(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_10 obj = (BResult_10)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bbuf.putString(obj._result);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_10 obj = (BResult_10)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_10()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = bbuf.getString();
			
			return obj;
		}
		
	}
} // namespace
﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteMapTypes_getString1
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_1268625399 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1268625399();
		
		public BSerializer_1268625399()
			: base(1268625399) {}
		
		public BSerializer_1268625399(int typeId)
			: base(typeId) {}
		
		
		public override int size(Object obj, BBinaryModel bmodel)
		{
			return 0
			       /* size of base class */ + 0
			       /* padding up to multiple of alignment */ + 0;			
		}
		
		public override Object read(Object obj1, BInput bin1, int version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteMapTypes_getString1 obj = (BRequest_RemoteMapTypes_getString1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_getString1()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteReferences_getNode
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_655936732 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_655936732();
		
		public BSerializer_655936732()
			: base(655936732) {}
		
		public BSerializer_655936732(int typeId)
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
			BRequest_RemoteReferences_getNode obj = (BRequest_RemoteReferences_getNode)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteReferences_getNode()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_setObject
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_450975945 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_450975945();
		
		public BSerializer_450975945()
			: base(450975945) {}
		
		public BSerializer_450975945(int typeId)
			: base(typeId) {}
		
		
		public override int size(Object obj, BBinaryModel bmodel)
		{
			return 0
			       /* size of base class */ + 0
			       /* pos=0: v */ + 4			
			       /* padding up to multiple of alignment */ + 4;			
		}
		
		public override void write(Object obj1, BOutput bout1, int version)
		{
			BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._v, false, null);
		}
		
		public override Object read(Object obj1, BInput bin1, int version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setObject()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._v = (Object)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
﻿//
// Serializer for com.wilutions.byps.test.api.BResult_936607009
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_1317331941 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1317331941();
		
		public BSerializer_1317331941()
			: base(1317331941) {}
		
		public BSerializer_1317331941(int typeId)
			: base(typeId) {}
		
		
		public override int size(Object obj, BBinaryModel bmodel)
		{
			return 0
			       /* size of base class */ + 0
			       /* pos=0: result */ + 4			
			       /* padding up to multiple of alignment */ + 4;			
		}
		
		public override void write(Object obj1, BOutput bout1, int version)
		{
			BResult_936607009 obj = (BResult_936607009)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, com.wilutions.byps.test.api.BSerializer_936607009.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, int version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_936607009 obj = (BResult_936607009)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_936607009()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (HashSet<char>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
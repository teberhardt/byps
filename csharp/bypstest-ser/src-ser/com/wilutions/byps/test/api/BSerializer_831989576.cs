﻿//
// Serializer for com.wilutions.byps.test.api.BResult_1633500852
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_831989576 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_831989576();
		
		public BSerializer_831989576()
			: base(831989576) {}
		
		public BSerializer_831989576(int typeId)
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
			BResult_1633500852 obj = (BResult_1633500852)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, com.wilutions.byps.test.api.BSerializer_1633500852.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, int version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1633500852 obj = (BResult_1633500852)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1633500852()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (IList<IDictionary<int,IList<HashSet<int>>>>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
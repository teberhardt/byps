﻿//
// Serializer for byps.test.api.enu.UsePlanets
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.enu
{
	
	public class BSerializer_10000 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_10000();
		
		public BSerializer_10000()
			: base(10000) {}
		
		public BSerializer_10000(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			UsePlanets obj = (UsePlanets)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bbuf.putInt((int)obj.Planet);
			bbuf.putInt((int)obj.Planet2);
			bout.writeObj(obj.ArrayOfPlanets, false, byps.test.api.BSerializer_1441131650.instance);
			bout.writeObj(obj.ListOfPlanets, false, byps.test.api.BSerializer_819140569.instance);
			bout.writeObj(obj.MapOfPlanets, false, byps.test.api.BSerializer_493795497.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			UsePlanets obj = (UsePlanets)(obj1 != null ? obj1 : bin.onObjectCreated(new UsePlanets()));
			
			BBufferBin bbuf = bin.bbuf;
			obj.Planet = (byps.test.api.enu.EnumPlanets)bbuf.getInt();
			obj.Planet2 = (byps.test.api.enu.EnumPlanets)bbuf.getInt();
			obj.ArrayOfPlanets = (byps.test.api.enu.EnumPlanets[])bin.readObj(false, byps.test.api.BSerializer_1441131650.instance);
			obj.ListOfPlanets = (List<byps.test.api.enu.EnumPlanets>)bin.readObj(false, null);
			obj.MapOfPlanets = (IDictionary<String,byps.test.api.enu.EnumPlanets>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
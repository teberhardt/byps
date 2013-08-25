﻿//
// Serializer for com.wilutions.byps.test.api.inl.Point2D[][][]
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_1264295566 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1264295566();
		
		public BSerializer_1264295566() : 
			base(1264295566) {}
		
		public override int size(Object obj, BBinaryModel bmodel) { 
			int elementSize = bmodel.pointerSize;
			com.wilutions.byps.test.api.inl.Point2D[,,] arr = (com.wilutions.byps.test.api.inl.Point2D[,,])obj;
			int n = arr.GetLength(0);
			n *= arr.GetLength(1);
			n *= arr.GetLength(2);
			return bmodel.computeArrayWireSize(elementSize, n);
		}
		
		public override Object read(Object obj1, BInput bin1, int version) {
			BInputBin bin = (BInputBin)bin1;
			BBufferBin bbuf = bin.bbuf;
			
			// lengths
			int n2 = bbuf.getLength();
			int n1 = bbuf.getLength();
			int n0 = bbuf.getLength();
			
			// create array
			com.wilutions.byps.test.api.inl.Point2D[,,] arr =  new com.wilutions.byps.test.api.inl.Point2D[n2,n1,n0];
			
			// read
			for (int i2 = 0; i2 < n2; i2++) {
				for (int i1 = 0; i1 < n1; i1++) {
					for (int i0 = 0; i0 < n0; i0++) {
						arr[i2,i1,i0] = (com.wilutions.byps.test.api.inl.Point2D)bin.readObj(false, com.wilutions.byps.test.api.inl.BSerializer_1835035436.instance);
					}
				}
			}
			
			return arr;
		}
		
		public override void write(Object obj1, BOutput bout1, int version) {
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			
			com.wilutions.byps.test.api.inl.Point2D[,,] arr = (com.wilutions.byps.test.api.inl.Point2D[,,])obj1;
			
			// lengths
			int n2 = arr.GetLength(0);
			int n1 = arr.GetLength(1);
			int n0 = arr.GetLength(2);
			bbuf.putLength(n2);
			bbuf.putLength(n1);
			bbuf.putLength(n0);
			
			// write
			for (int i2 = 0; i2 < n2; i2++) {
				for (int i1 = 0; i1 < n1; i1++) {
					for (int i0 = 0; i0 < n0; i0++) {
						bout.writeObj(arr[i2,i1,i0], false, com.wilutions.byps.test.api.inl.BSerializer_1835035436.instance);
					}
				}
			}
		}
		
	}
} // namespace
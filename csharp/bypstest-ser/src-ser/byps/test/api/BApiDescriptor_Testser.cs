﻿using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BApiDescriptor_Testser { 
	
		/**
		 * API serialisation version: 793.0.0.0
		 */
		public const long VERSION = 79300000000000000L;
		
		public readonly static BApiDescriptor instance = new BApiDescriptor(
			"Testser",
			"byps.test.api",
			VERSION,
			false) // uniqueObjects
			.addRegistry(new BRegistry_Testser());
		
		
	}
}

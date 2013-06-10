﻿package com.wilutions.byps.test.api;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

@SuppressWarnings("all")
public class BServer_Testser extends BServer { 

	public static BServer_Testser createServer(BTransportFactory transportFactory) {
		return new BServer_Testser(transportFactory);
	}
	
	public static BServer_Testser createServerR(BTransport transport) {
		return new BServer_Testser(transport);
	}
	
	public BServer_Testser(BTransport transport) {
		super(transport, null);
	}
	
	public BServer_Testser(BTransportFactory transportFactory) {
		super(
			transportFactory.createServerTransport(),
			transportFactory.createClientR(
				BClient_Testser.createClientR(
					transportFactory.createClientTransport()
				)
			)
		);
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteArrayTypes1dim remoteSkeleton) {
		addRemote(1557084481, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteArrayTypes4dim remoteSkeleton) {
		addRemote(1557173854, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteEnums remoteSkeleton) {
		addRemote(359349400, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteInlineInstance remoteSkeleton) {
		addRemote(1206670536, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteListTypes remoteSkeleton) {
		addRemote(380156079, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteMapTypes remoteSkeleton) {
		addRemote(80483097, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemotePrimitiveTypes remoteSkeleton) {
		addRemote(1341983932, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteReferences remoteSkeleton) {
		addRemote(2086824050, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteSetTypes remoteSkeleton) {
		addRemote(1156008353, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteStreams remoteSkeleton) {
		addRemote(2028487863, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.srvr.BSkeleton_ClientIF remoteSkeleton) {
		addRemote(1784257353, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.srvr.BSkeleton_ServerIF remoteSkeleton) {
		addRemote(1313562065, remoteSkeleton);
		return this;
	}
	
	public BServer_Testser addRemote(com.wilutions.byps.test.api.ver.BSkeleton_EvolveIF remoteSkeleton) {
		addRemote(2078696281, remoteSkeleton);
		return this;
	}
	
}

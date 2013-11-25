package byps.test.api;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenClient DO NOT MODIFY.
 */

import byps.*;

public class BClient_Testser extends BClient { 

	public static BClient_Testser createClient(BTransportFactory transportFactory) {
		return new BClient_Testser(transportFactory);
	}
	
	public static BClient_Testser createClientR(BTransport transport) {
		return new BClient_Testser(transport);
	}
	
	protected BClient_Testser(BTransportFactory transportFactory) {
		super(
			transportFactory.createClientTransport(), 
			transportFactory.createServerR(
				BServer_Testser.createServerR(transportFactory.createServerTransport())
			)
		);
		bioFruitService = new byps.test.api.inherit.BStub_BioFruitService(transport);
		bioLemonService = new byps.test.api.inherit.BStub_BioLemonService(transport);
		fruitService = new byps.test.api.inherit.BStub_FruitService(transport);
		lemonService = new byps.test.api.inherit.BStub_LemonService(transport);
		plantService = new byps.test.api.inherit.BStub_PlantService(transport);
		remoteArrayTypes1dim = new byps.test.api.remote.BStub_RemoteArrayTypes1dim(transport);
		remoteArrayTypes23 = new byps.test.api.remote.BStub_RemoteArrayTypes23(transport);
		remoteArrayTypes4dim = new byps.test.api.remote.BStub_RemoteArrayTypes4dim(transport);
		remoteConstants = new byps.test.api.remote.BStub_RemoteConstants(transport);
		remoteEnums = new byps.test.api.remote.BStub_RemoteEnums(transport);
		remoteInlineInstance = new byps.test.api.remote.BStub_RemoteInlineInstance(transport);
		remoteListTypes = new byps.test.api.remote.BStub_RemoteListTypes(transport);
		remoteMapTypes = new byps.test.api.remote.BStub_RemoteMapTypes(transport);
		remotePrimitiveTypes = new byps.test.api.remote.BStub_RemotePrimitiveTypes(transport);
		remoteReferences = new byps.test.api.remote.BStub_RemoteReferences(transport);
		remoteServerCtrl = new byps.test.api.remote.BStub_RemoteServerCtrl(transport);
		remoteSetTypes = new byps.test.api.remote.BStub_RemoteSetTypes(transport);
		remoteStreams = new byps.test.api.remote.BStub_RemoteStreams(transport);
		remoteWithAuthentication = new byps.test.api.remote.BStub_RemoteWithAuthentication(transport);
		clientIF = new byps.test.api.srvr.BStub_ClientIF(transport);
		serverIF = new byps.test.api.srvr.BStub_ServerIF(transport);
		evolveIF = new byps.test.api.ver.BStub_EvolveIF(transport);
	}
	
	public BClient_Testser addRemote(byps.test.api.inherit.BSkeleton_BioFruitService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(612235846, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.inherit.BSkeleton_BioLemonService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(501819909, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.inherit.BSkeleton_FruitService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(937293552, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.inherit.BSkeleton_LemonService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(826877615, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.inherit.BSkeleton_PlantService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1733272281, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteArrayTypes1dim remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1176140631, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteArrayTypes23 remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(964138163, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteArrayTypes4dim remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1176051258, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteConstants remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(429088323, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteEnums remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1222673152, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteInlineInstance remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(355071648, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteListTypes remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1240892695, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteMapTypes remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1277224527, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemotePrimitiveTypes remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1391241180, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteReferences remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1173792730, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteServerCtrl remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(2037577312, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteSetTypes remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1781251319, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteStreams remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(2123238175, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.remote.BSkeleton_RemoteWithAuthentication remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1532028880, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.srvr.BSkeleton_ClientIF remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(955752991, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.srvr.BSkeleton_ServerIF remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(1426448279, remoteSkeleton);
		return this;
	}
	
	public BClient_Testser addRemote(byps.test.api.ver.BSkeleton_EvolveIF remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(564008001, remoteSkeleton);
		return this;
	}
	
	protected BClient_Testser(BTransport transport) {
		super(transport, null);
		bioFruitService = new byps.test.api.inherit.BStub_BioFruitService(transport);
		bioLemonService = new byps.test.api.inherit.BStub_BioLemonService(transport);
		fruitService = new byps.test.api.inherit.BStub_FruitService(transport);
		lemonService = new byps.test.api.inherit.BStub_LemonService(transport);
		plantService = new byps.test.api.inherit.BStub_PlantService(transport);
		remoteArrayTypes1dim = new byps.test.api.remote.BStub_RemoteArrayTypes1dim(transport);
		remoteArrayTypes23 = new byps.test.api.remote.BStub_RemoteArrayTypes23(transport);
		remoteArrayTypes4dim = new byps.test.api.remote.BStub_RemoteArrayTypes4dim(transport);
		remoteConstants = new byps.test.api.remote.BStub_RemoteConstants(transport);
		remoteEnums = new byps.test.api.remote.BStub_RemoteEnums(transport);
		remoteInlineInstance = new byps.test.api.remote.BStub_RemoteInlineInstance(transport);
		remoteListTypes = new byps.test.api.remote.BStub_RemoteListTypes(transport);
		remoteMapTypes = new byps.test.api.remote.BStub_RemoteMapTypes(transport);
		remotePrimitiveTypes = new byps.test.api.remote.BStub_RemotePrimitiveTypes(transport);
		remoteReferences = new byps.test.api.remote.BStub_RemoteReferences(transport);
		remoteServerCtrl = new byps.test.api.remote.BStub_RemoteServerCtrl(transport);
		remoteSetTypes = new byps.test.api.remote.BStub_RemoteSetTypes(transport);
		remoteStreams = new byps.test.api.remote.BStub_RemoteStreams(transport);
		remoteWithAuthentication = new byps.test.api.remote.BStub_RemoteWithAuthentication(transport);
		clientIF = new byps.test.api.srvr.BStub_ClientIF(transport);
		serverIF = new byps.test.api.srvr.BStub_ServerIF(transport);
		evolveIF = new byps.test.api.ver.BStub_EvolveIF(transport);
	}
	
	@Override
	public BRemote getStub(int remoteId) {
		if (remoteId == 612235846) return bioFruitService;
		if (remoteId == 501819909) return bioLemonService;
		if (remoteId == 937293552) return fruitService;
		if (remoteId == 826877615) return lemonService;
		if (remoteId == 1733272281) return plantService;
		if (remoteId == 1176140631) return remoteArrayTypes1dim;
		if (remoteId == 964138163) return remoteArrayTypes23;
		if (remoteId == 1176051258) return remoteArrayTypes4dim;
		if (remoteId == 429088323) return remoteConstants;
		if (remoteId == 1222673152) return remoteEnums;
		if (remoteId == 355071648) return remoteInlineInstance;
		if (remoteId == 1240892695) return remoteListTypes;
		if (remoteId == 1277224527) return remoteMapTypes;
		if (remoteId == 1391241180) return remotePrimitiveTypes;
		if (remoteId == 1173792730) return remoteReferences;
		if (remoteId == 2037577312) return remoteServerCtrl;
		if (remoteId == 1781251319) return remoteSetTypes;
		if (remoteId == 2123238175) return remoteStreams;
		if (remoteId == 1532028880) return remoteWithAuthentication;
		if (remoteId == 955752991) return clientIF;
		if (remoteId == 1426448279) return serverIF;
		if (remoteId == 564008001) return evolveIF;
		return null;
	}
	
	public final byps.test.api.inherit.BioFruitServiceAuth bioFruitService;
	public final byps.test.api.inherit.BioLemonServiceAuth bioLemonService;
	public final byps.test.api.inherit.FruitServiceAuth fruitService;
	public final byps.test.api.inherit.LemonServiceAuth lemonService;
	public final byps.test.api.inherit.PlantServiceAuth plantService;
	public final byps.test.api.remote.RemoteArrayTypes1dimAsync remoteArrayTypes1dim;
	public final byps.test.api.remote.RemoteArrayTypes23Async remoteArrayTypes23;
	public final byps.test.api.remote.RemoteArrayTypes4dimAsync remoteArrayTypes4dim;
	public final byps.test.api.remote.RemoteConstantsAsync remoteConstants;
	public final byps.test.api.remote.RemoteEnumsAsync remoteEnums;
	public final byps.test.api.remote.RemoteInlineInstanceAsync remoteInlineInstance;
	public final byps.test.api.remote.RemoteListTypesAsync remoteListTypes;
	public final byps.test.api.remote.RemoteMapTypesAsync remoteMapTypes;
	public final byps.test.api.remote.RemotePrimitiveTypesAsync remotePrimitiveTypes;
	public final byps.test.api.remote.RemoteReferencesAsync remoteReferences;
	public final byps.test.api.remote.RemoteServerCtrlAsync remoteServerCtrl;
	public final byps.test.api.remote.RemoteSetTypesAsync remoteSetTypes;
	public final byps.test.api.remote.RemoteStreamsAsync remoteStreams;
	public final byps.test.api.remote.RemoteWithAuthenticationAuth remoteWithAuthentication;
	public final byps.test.api.srvr.ClientIFAsync clientIF;
	public final byps.test.api.srvr.ServerIFAsync serverIF;
	public final byps.test.api.ver.EvolveIFAsync evolveIF;
	
}

﻿package com.wilutions.byps.test.api.ver;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteClassAsync:64
public interface EvolveIFAsync extends EvolveIF, BRemote {

	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setEvolve(Evolve obj) throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void setEvolve(Evolve obj, final BAsyncResult<Object> asyncResult) ;
	
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public Evolve getEvolve() throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void getEvolve(final BAsyncResult<Evolve> asyncResult) ;
	
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setClient(EvolveIF partner) throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void setClient(EvolveIF partner, final BAsyncResult<Object> asyncResult) ;
	
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public EvolveIF getClient() throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void getClient(final BAsyncResult<EvolveIF> asyncResult) ;
	
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void sendEvolveToClient() throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void sendEvolveToClient(final BAsyncResult<Object> asyncResult) ;
	
	
}

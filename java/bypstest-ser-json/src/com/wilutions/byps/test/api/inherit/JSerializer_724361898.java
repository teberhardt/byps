package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BRequest_BioFruitService_certify
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_724361898 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_724361898();
	
	public JSerializer_724361898() {
		super(724361898);
	}
	
	public JSerializer_724361898(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_BioFruitService_certify obj = (BRequest_BioFruitService_certify)obj1;		
		bbuf.putString("param", obj.param);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_BioFruitService_certify obj = (BRequest_BioFruitService_certify)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_BioFruitService_certify()));
		
		final BJsonObject js = bin.currentObject;
		obj.param = js.getString("param");
		
		return obj;
	}
	
}

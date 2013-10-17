package com.wilutions.byps.gen.cs;

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wilutions.byps.gen.api.GeneratorException;
import com.wilutions.byps.gen.api.MemberInfo;
import com.wilutions.byps.gen.api.MethodInfo;
import com.wilutions.byps.gen.api.RemoteInfo;
import com.wilutions.byps.gen.api.TypeInfo;
import com.wilutions.byps.gen.utils.CodePrinter;
import com.wilutions.byps.gen.utils.Utils;

class GenRemoteStub {
	
	static Log log = LogFactory.getLog(GenRemoteStub.class);
	
	static void generate(PrintContext pctxt, RemoteInfo rinfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");
		log.info("generate " + rinfo.qname);
		CodePrinter pr = pctxt.getPrinterForApiClass(rinfo, PrintContext.STUB_PREFIX, true);
		new GenRemoteStub(pctxt, rinfo, pr).generate();
		pr.close();
		//log.debug(GeneratorJ.class.getName(), "generate");
	}
	
	private GenRemoteStub(PrintContext pctxt, RemoteInfo rinfo, CodePrinter pr) throws GeneratorException {
	  
		this.rinfo = pctxt.getBaseRemoteForStub(rinfo);
		this.pr = pr;
		this.className = pctxt.getStubClassQName(rinfo, rinfo.pack);
		this.pctxt = pctxt;
	}
	
	private void printMethod(MethodInfo methodInfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "printMethod");
		
		CodePrinter mpr = pr.print("public ");
		pctxt.printDeclareMethod(mpr, rinfo, methodInfo).println(" {");
		
		pr.beginBlock();
		
		String rtype = pctxt.getReturnTypeAsObjType(methodInfo, rinfo.pack);
		String asyncResultType = "BSyncResult<" + rtype + ">";
		pr.print(asyncResultType).print(" asyncResult = new BSyncResult<" + rtype + ">();");
		pr.println();

		String methodName = pctxt.makePublicMemberName(methodInfo.name);
		mpr = pr.print(methodName).print("Async").print("(");
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
		  
      // Skip authentication parameter
      if (pctxt.isSessionParam(rinfo, pinfo)) continue;
		  
			if (first) first = false; else mpr.print(", ");
			String mname = pctxt.makeValidMemberName(pinfo.name);
			mpr.print(mname);
		}
		if (!first) mpr.print(", ");
		mpr.print("asyncResult");
		mpr.println(");");

		boolean hasOwnExceptions = methodInfo.exceptions.size() != 0;
		if (hasOwnExceptions) {
			pr.println("try {");
			pr.beginBlock();
		}
		
		mpr = pr;
		if (!methodInfo.resultInfo.members.get(0).type.isVoidType()) {
			mpr = pr.print("return ");
		}
		mpr.print("asyncResult.GetResult();");
		pr.println();

		if (hasOwnExceptions) {
			pr.endBlock();
			pr.println("} ");
			pr.println("catch (BException e) {");
			pr.beginBlock();
			pr.println("Exception cause = e.GetBaseException();");
			pr.println("if (cause != null) {");
			pr.beginBlock();
			for (TypeInfo exInfo : methodInfo.exceptions) {
				String exName = exInfo.toString(rinfo.pack);
				pr.print("if (cause is ").print(exName).print(") throw (").print(exName).print(")cause;").println();
			}
			pr.endBlock();
			pr.println("}");
			pr.println("throw e;");
			pr.endBlock();
			pr.println("}");
		}
		
		pr.endBlock();
		pr.println("}");
		
		//log.debug(GeneratorJ.class.getName(), "printMethod");
	}
	
	private void printMethodAsync(MethodInfo methodInfo) throws IOException {
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
		
		CodePrinter mpr = pr.print("public ");
		mpr = pctxt.printDeclareMethodAsync(mpr, rinfo, methodInfo);
		mpr.println("{");
		pr.beginBlock();
		
		String requestClass = methodInfo.requestInfo.toString(rinfo.pack);
		pr.print(requestClass).print(" req = new ").print(requestClass).print("();");
		pr.println();
		
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
		  
      // Skip authentication parameter
      if (pctxt.isSessionParam(rinfo, pinfo)) continue;
		  
			String mname = pctxt.makeValidMemberName(pinfo.name);
			pr.print("req._").print(pinfo.name).print(" = ").print(mname).print(";").println();
		}
		
		String rtype = pctxt.getReturnTypeAsObjType(methodInfo, rinfo.pack);
		String outerAsyncClass = "BAsyncResultReceiveMethod<" + rtype + ">";
		pr.print(outerAsyncClass).print(" outerResult = new ").print(outerAsyncClass).print("(asyncResult);").println();
		
		pr.println("transport.send(req, outerResult);");

		pr.endBlock();
		
		pr.println("}");
		//log.debug(GeneratorJ.class.getName(), "printMethodAsync");
	}

	private void printMethodBeginAsync(MethodInfo methodInfo) throws GeneratorException {
		CodePrinter mpr = pr.print("public ");
		mpr = pctxt.printDeclareMethodBeginAsync(mpr, rinfo, methodInfo);
		mpr.println("{");
		pr.beginBlock();
		
		String rtype = pctxt.getReturnTypeAsObjType(methodInfo, rinfo.pack);
		String asyncProgModel = "BAsyncProgModel<" + rtype + ">";
		pr.print(asyncProgModel).print(" _byps_ret = new ").print(asyncProgModel).print("(callback, state);").println();
        
		String methodName = pctxt.makePublicMemberName(methodInfo.name);
		mpr = pr.print(methodName).print("Async").print("(");
		
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
      
		  // Skip authentication parameter
      if (pctxt.isSessionParam(rinfo, pinfo)) continue;

      if (first) first = false; else mpr.print(", ");
			String mname = pctxt.makeValidMemberName(pinfo.name);
			mpr.print(mname);
		}
		if (!first) mpr = mpr.print(", ");
		mpr.print("_byps_ret);").println();
		
		pr.println("return _byps_ret;");
		pr.endBlock();
		pr.println("}");
	}
	
  private void printMethodEndAsync(MethodInfo methodInfo) throws GeneratorException {
    
    CodePrinter mpr = pr.print("public ");
    mpr = pctxt.printDeclareMethodEndAsync(mpr, rinfo, methodInfo);
    mpr.println(" {");
    
    String rtype = pctxt.getReturnTypeAsObjType(methodInfo, rinfo.pack);
    String asyncProgModel = "BAsyncProgModel<" + rtype + ">";
    
    pr.beginBlock();
    pr.print("return ((").print(asyncProgModel).print(")asyncResult).Result;").println();
    pr.endBlock();
    pr.println("}");
    
  }

  private void printMethodTask(MethodInfo methodInfo) throws GeneratorException {
    
    CodePrinter mpr = pr.print("public ");
    mpr = pctxt.printDeclareMethodTask(mpr, rinfo, methodInfo);
    mpr.println(" {");
    pr.beginBlock();
    
    String methodName = Utils.firstCharToUpper(methodInfo.name);
    String taskType = pctxt.getReturnTask(rinfo, methodInfo);
    
    mpr = pr;
    
    MemberInfo returnInfo = methodInfo.resultInfo.members.get(0);
    if (!returnInfo.type.isVoidType()) {
      mpr = mpr.print("return ");
    }
    
    mpr = mpr.print("await ").print(taskType).print(".Factory.FromAsync(");
    mpr = mpr.print("Begin").print(methodName).print(", End").print(methodName);
    
    for (MemberInfo pinfo : methodInfo.requestInfo.members) {
      
      // Skip authentication parameter
      if (pctxt.isSessionParam(rinfo, pinfo)) continue;
      
      String mname = pctxt.makeValidMemberName(pinfo.name);
      mpr = mpr.print(", ").print(mname);
    }

    mpr.println(", null);");
    
    pr.endBlock();
    pr.println("}");
    
  }


	private void printSerialVersionUID() {
		//log.debug(GenApiClass.class.getName(), "printSerialVersionUID");
		pr.println("public readonly static long serialVersionUID = " + rinfo.typeId + "L;");
		//log.debug(GenApiClass.class.getName(), "printSerialVersionUID");
	}
	
	private void generate() throws IOException {
		//log.debug(GeneratorJ.class.getName(), "generate");

		pr.println("using System;");
		pr.println("using System.Collections.Generic;");
		
		if (pctxt.isAwaitSupported()) {
		  pr.println("using System.Threading.Tasks;");
		}
		
		pr.println("using com.wilutions.byps;");
		pr.println();
		pr.println("namespace " + rinfo.pack);
		pr.println("{");
		pr.beginBlock();
		pr.println();
		
		pr.print("public class ").print(className)
		.print(" : BStub, ").print(rinfo.name).print(", BSerializable {");
		pr.println();
		
		pr.beginBlock();
		
		pr.println();
		printSerialVersionUID();
		pr.println();
		
//		String apiDescClassName = pctxt.getApiDescriptorClassName();
//		String apiDescPack = pctxt.getApiDescriptorPackage();
//		String apiDescQName = apiDescPack + "." + apiDescClassName;
		
		pr.print("public ").print(className).print("(BTransport transport)").println();
		pr.beginBlock();
		pr.print(": base(transport) {}");
		pr.println();
		pr.endBlock();
		pr.println();

    HashMap<String, RemoteInfo> remotes = new HashMap<String, RemoteInfo>();
    pctxt.collectAllRemotesForStubOrSkeleton(rinfo, remotes);
    for (RemoteInfo r : remotes.values()) {
      printMethods(r);
    }
    
		pr.println();
		
		pr.endBlock();
		
		pr.println("}");

		pr.endBlock();
		
		pr.println("}");
		
		//log.debug(GeneratorJ.class.getName(), "generate");
	}

  private void printMethods(RemoteInfo rinfoImpl) throws IOException {
    
    for (MethodInfo minfo : rinfoImpl.methods) {
      printMethod(minfo);
      printMethodAsync(minfo);
      printMethodBeginAsync(minfo);
      printMethodEndAsync(minfo);
      
      if (pctxt.isAwaitSupported()) {
        printMethodTask(minfo);
      }
      pr.println();
    }
  }
  
	private final RemoteInfo rinfo;
	private final CodePrinter pr;
	private final String className;
	private final PrintContext pctxt;
	
}

/*
 * 
 *         public IAsyncResult BeginAdd(int a, int b, AsyncCallback callback, object state)
        {
            BAsyncProgModel<int> ret = new BAsyncProgModel<int>(callback, state);
            async_Add(a, b, ret);
            return ret;
        }

        public int EndAdd(IAsyncResult asyncResult)
        {
            return ((BAsyncProgModel<int>)asyncResult).Result;
        }

*/

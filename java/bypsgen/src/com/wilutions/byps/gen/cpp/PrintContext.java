package com.wilutions.byps.gen.cpp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import com.wilutions.byps.gen.api.CommentInfo;
import com.wilutions.byps.gen.api.GeneratorException;
import com.wilutions.byps.gen.api.GeneratorProperties;
import com.wilutions.byps.gen.api.MemberInfo;
import com.wilutions.byps.gen.api.MethodInfo;
import com.wilutions.byps.gen.api.RemoteInfo;
import com.wilutions.byps.gen.api.SerialInfo;
import com.wilutions.byps.gen.api.TypeInfo;
import com.wilutions.byps.gen.db.ClassDB;
import com.wilutions.byps.gen.utils.CodePrinter;
import com.wilutions.byps.gen.utils.PrintContextBase;
import com.wilutions.byps.gen.utils.SplitFileOutputStream;
import com.wilutions.byps.gen.utils.Utils;

class PrintContext extends PrintContextBase {
	
	CodePrinter prImplC;

	/**
	 * Schreibt in den Header f�r �ffentliche Definitionen.
	 */
	CodePrinter prApiAllH;

	CodePrinter prImplAllH;

	PrintContext(ClassDB classDB, GeneratorProperties props) throws IOException {
		super(classDB, props);
		
		dirApi = props.getMandatoryPropertyFile(PropertiesCpp.DEST_DIR_API);
		File dirImpl = props.getOptionalPropertyFile(PropertiesCpp.DEST_DIR_IMPL, dirApi);
		dirImplC = props.getOptionalPropertyFile(PropertiesCpp.DEST_DIR_IMPL_C, dirImpl);
		dirImplH = props.getOptionalPropertyFile(PropertiesCpp.DEST_DIR_IMPL_H, dirImpl);
		packageAliasMap = props.getPropertyAsMap(PropertiesCpp.PACK_ALIAS, null);
		maxFileSize = props.getOptionalPropertyInt(PropertiesCpp.MAX_FILE_SIZE, 100 * 1000);
		
		dirApi.mkdirs();
		dirImplC.mkdirs();
		dirImplH.mkdirs();

		File fileApiAllH = new File(dirApi, apiName + "-api.h");
		prApiAllH = new CodePrinter(new FileOutputStream(fileApiAllH), false);
		prApiAllH.print("#ifndef __{0}__", apiName + "_api_H"); prApiAllH.println();
		prApiAllH.print("#define __{0}__", apiName + "_api_H"); prApiAllH.println();
		prApiAllH.println();
		prApiAllH.println("#include <Byps-api.h>");
		prApiAllH.println("#include \"" + apiName + "-fwd.h\"");
		prApiAllH.println("#pragma pack(push, 8)");
		
		File fileImplAllH = new File(dirImplH, apiName + "-impl.h");
		prImplAllH = new CodePrinter(new FileOutputStream(fileImplAllH), false);
		prImplAllH.print("#ifndef __{0}__", apiName + "_impl_H"); prImplAllH.println();
		prImplAllH.print("#define __{0}__", apiName + "_impl_H"); prImplAllH.println();
		prImplAllH.println();
		prImplAllH.println("#include <Byps-impl.h>");
		prImplAllH.print("#include <{0}>", apiName + "-api.h").println();
		prImplAllH.println();

		OutputStream osImplC = new SplitFileOutputStreamSource(null, apiName + "-impl-{0}.cpp", maxFileSize);
		prImplC = new CodePrinter(osImplC, false);
		
	}
	
	void close() throws IOException {
		prImplC.close();

		prApiAllH.println();
		prApiAllH.println("#pragma pack(pop)");
		prApiAllH.println("#endif");
		prApiAllH.close();
		
		prImplAllH.println();
		prImplAllH.println("#endif");
		prImplAllH.close();
	}
	
	/**
	 * C type name of pointer.
	 * If no package alias is defined, the returned pointer name is equal to tinfo.name.
	 * Otherwise the pointer name is computed as: [alias]_[tinfo.name].
	 * @param tinfo Type descriptor 
	 * @param dims if not empty, array dimensions
	 * @return Pointer name
	 */
	String getPointerName(SerialInfo tinfo, String dims) {
		return internalGetPointerName(tinfo, dims, false);
	}
	
	/**
	 * C type name of structure.
	 * The structure name is built by _[pointer-name]. 
	 * @param tinfo Type descriptor
	 * @param dims if not empty, array dimensions
	 * @return Pointer name
	 */
	String getStructName(SerialInfo tinfo, String dims) {
		return "_" + getPointerName(tinfo, dims);
	}
	
	/**
	 * Generates the #define symbol for the type ID.
	 * The symbol is computed by [pointer-name]_TypeId
	 * @param tinfo Type descriptor
	 * @return Type ID symbol
	 */
	String getTypeIdSymbol(SerialInfo tinfo) {
		return getPointerName(tinfo, "") + "_TypeId";
	}
	
	/**
	 * Union type name of R-pointer.
	 * Returns R[pointer-name].
	 * @param tinfo Type descriptor
	 * @param dims if not empty, array dimensions
	 * @return Type ID symbol
	 */
	String getRPointerName(SerialInfo tinfo, String dims) {
		return internalGetPointerName(tinfo, dims, true);
	}
	
	String getTypeC(TypeInfo tinfo, int dims) {
		String tname = "";
		if (tinfo.name.equals("boolean")) tname = "BBOOL";
		else if (tinfo.name.equals("byte")) tname = "BBYTE";
		else if (tinfo.name.equals("char")) tname = "BWCHAR";
		else if (tinfo.name.equals("int")) tname = "BINT32";
		else if (tinfo.name.equals("long")) tname = "BINT64";
		else if (tinfo.name.equals("float")) tname = "BFLOAT";
		else if (tinfo.name.equals("double")) tname = "BDOUBLE";
		else if (tinfo.name.equals("String")) tname = "RSTRING_UTF16";
		else if (tinfo.name.equals("Object")) tname = "RObject";
		return tname;
	}
	
//	private static class SplitFileOutputStreamHeader extends SplitFileOutputStream {
//		private CodePrinter prAll;
//		public SplitFileOutputStreamHeader(CodePrinter prAll, File dir, String fileNameFormat, int maxFileSize) {
//			super(dir, fileNameFormat, maxFileSize);
//			this.prAll = prAll;
//		}
//		@Override
//		public void onClosedSplitFile(File closedFile) {
//			prAll.print("#include \"");
//			prAll.print(closedFile.getName());
//			prAll.println("\"");
//		}
//		@Override
//		public void onOpenedSplitFile(File openedFile) {
//			PrintWriter pr = new PrintWriter(this);
//			pr.println("#include <Byps-api.h>");
//			pr.println();
//		}
//	};

	private class SplitFileOutputStreamSource extends SplitFileOutputStream {
		public SplitFileOutputStreamSource(CodePrinter prAll, String fileNameFormat, int maxFileSize) throws IOException {
			super(dirImplC, fileNameFormat, maxFileSize);
		}
		@Override
		public void onClosedSplitFile(File closedFile) {
		}
		@Override
		public void onOpenedSplitFile() throws IOException {
			CodePrinter prImplC = new CodePrinter(this, false);
			prImplC.print("#include \"{0}\"",
					getDirRelative(dirImplC.getAbsolutePath(), dirImplH.getAbsolutePath()) + apiName + "-impl.h");
			prImplC.println(); 
			prImplC.println("using namespace std;");
			prImplC.println("using namespace com::wilutions::byps;");
			prImplC.println();
			prImplC.flush();
		}
	};

	/**
	 * Return the directory dirAbs relative to dirBase
	 * @param dirBase Base directory
	 * @param dirAbs Absolute directory
	 * @return Relative directory
	 */
	private static String getDirRelative(String dirBase, String dirAbs) {
		StringBuilder dirRel = new StringBuilder();
		
		// Example 1
		// dirBase=d:/temp/byps/genc/impl/source
		// dirAbs=d:/temp/byps/genc/impl/header
		// dirRel=../header/
		
		// Example 2
		// dirBase=d:/temp/byps/genc/impl/source
		// dirAbs=d:/temp/byps/genc/impl/source/header
		// dirRel=header/

		// Example 3
		// dirBase=d:/temp/byps/genc/impl/source
		// dirAbs=d:/temp/byps/genc/header-impl
		// dirRel=../../header/

		String[] dirsBase = dirBase.split("\\" + File.separator);
		String[] dirsAbs = dirAbs.split("\\" + File.separator);
		int i = 0;
		while (i < dirsBase.length && i < dirsAbs.length && 
				dirsBase[i].equalsIgnoreCase(dirsAbs[i])) {
			i++;
		}
		
		// Example 1, i=6, dirsBase[i..] = {source}, dirsAbs[i...] = {header}
		// Example 2, i=7, dirsBase[i..] = {}, dirsAbs[i...] = {header}
		// Example 3, i=5, dirsBase[i..] = {impl, source}, dirsAbs[i...] = {header-impl}
		
		for (int j = i; j < dirsAbs.length; j++) {
			dirRel.append("..").append(File.separator);
		}
		for (int j = i; j < dirsAbs.length; j++) {
			dirRel.append(dirsAbs[j]).append(File.separator);
		}

		return dirRel.toString();
	}
	
	private String internalGetPointerName(SerialInfo tinfo, String dims, boolean isRPointer) {
		String palias = packageAliasMap.get(tinfo.pack);
		String r = tinfo.name;

		int dimCount = Utils.getDimCount(dims);
		if (dimCount == 0) {
			
		} else if (dimCount == 1) {
			r = "Array_" + r; 
		}
		else {
			r = "Array" + dimCount + "_" + r;
		}

		if (isRPointer) {
			r = "R" + r;
		}
		
		if (palias != null) {
			r = palias + "_" + r;
		}
		
		return r;
	}
	
	static void printDoNotModify(CodePrinter pr, String ... lines) {
		pr.println("/*");
		pr.print(" * ").line();
		pr.println(" * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.");
		pr.print(" * ").line();
		if (lines != null) {
			for (String line : lines) {
				pr.print(" * ").println(line);
			}
		}
		pr.println(" */");
		pr.println();
		
	}
	
	void printLine(CodePrinter pr) {
		pr.println("//-------------------------------------------------");
	}

	String getReturnType(MethodInfo methodInfo, String pack) {
		TypeInfo rtype = methodInfo.resultInfo.members.get(0).type;
		TypeInfoCpp cppInfo = new TypeInfoCpp(rtype);
		String qname = cppInfo.getQTypeName();
		return qname;
	}
	
	private void printComment(CodePrinter pr, Iterable<CommentInfo> comments, String jkind, String cskindBegin, String cskindEnd) throws IOException {
		for (CommentInfo cmt : comments) {
			if (!cmt.kind.equals(jkind)) continue;
			String t = cmt.text.trim().replace("\r", "\n"); 
			pr.print("/// ").print(cskindBegin).println();
			for (String line : t.split("\n")) {
				pr.print("/// ").println(line.trim());
			}
			pr.print("/// ").print(cskindEnd).println();
			break;
		}
	}

	public void printComments(CodePrinter pr, Iterable<CommentInfo> comments) throws IOException {
		if (comments != null) {
			printComment(pr, comments, CommentInfo.KIND_SUMMARY, "<summary>", "</summary>");
			printComment(pr, comments, CommentInfo.KIND_REMARKS, "<remarks>", "</remarks>");
		}
	}

	public CodePrinter printDefineMethod(CodePrinter pr, RemoteInfo rinfo,
			MethodInfo methodInfo) {
		return pr;
	}

	public CodePrinter printDefineMethodAsync(CodePrinter pr,
			RemoteInfo rinfo, MethodInfo methodInfo) {
		return pr;
	}

	public String makePublicMemberName(String name) throws GeneratorException {
		if (((PropertiesCpp)props).isUppercaseFirstLetter()) {
			name = Utils.firstCharToUpper(name);
		}
		return name;
	}

	public CodePrinter printDeclareMethodAsync(CodePrinter pr,
			RemoteInfo rinfo, MethodInfo methodInfo) throws GeneratorException {
		String methodName = makePublicMemberName(methodInfo.name);
		CodePrinter mpr = pr.print("void ").print("async_").print(methodName).print("(");
		
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
			if (first) first = false; else mpr.print(", ");
			TypeInfoCpp tinfoCpp = new TypeInfoCpp(pinfo.type);
			mpr.print(tinfoCpp.toString(rinfo.pack)).print(" ").print(pinfo.name);
		}
		
		MemberInfo returnInfo = methodInfo.resultInfo.members.get(0);
		TypeInfoCpp tinfoCpp = new TypeInfoCpp(returnInfo.type);
		String rtype = tinfoCpp.toString(rinfo.pack);
		if (rtype.equals("void")) rtype = "bool";
		String asyncResultType = "byps_ptr< BAsyncResult< " + rtype + " > >";
		if (!first) mpr.print(", ");
		mpr.print(asyncResultType).print(" asyncResult) ");

		return mpr;
	}

	public CodePrinter printDeclareMethod(CodePrinter pr, RemoteInfo rinfo,
			MethodInfo methodInfo) throws GeneratorException {
		String methodName = makePublicMemberName(methodInfo.name);

		MemberInfo returnInfo = methodInfo.resultInfo.members.get(0);
		TypeInfoCpp tinfoCpp = new TypeInfoCpp(returnInfo.type);
		String rtype = tinfoCpp.toString(rinfo.pack);

		CodePrinter mpr = pr.print(rtype).print(" ").print(methodName).print("(");
		
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
			if (first) first = false; else mpr.print(", ");
			tinfoCpp = new TypeInfoCpp(pinfo.type);
			mpr.print(tinfoCpp.toString(rinfo.pack)).print(" ").print(pinfo.name);
		}
		
		mpr.print(") ");

		return mpr;
	}


	private File dirApi;
	private File dirImplH;
	private File dirImplC;
	private int maxFileSize;
	private Map<String,String> packageAliasMap;




}


﻿using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BStub_RemotePrimitiveTypes : BStub, RemotePrimitiveTypes, BSerializable {	
		
		public readonly static long serialVersionUID = 1341983932L;
		
		public BStub_RemotePrimitiveTypes(BTransport transport)
			: base(transport) {}			
		
		public void VoidFunctionVoid() {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			VoidFunctionVoidAsync(asyncResult);
			asyncResult.GetResult();			
		}
		public void VoidFunctionVoidAsync(BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_voidFunctionVoid req = new BRequest_RemotePrimitiveTypes_voidFunctionVoid();			
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginVoidFunctionVoid(AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			VoidFunctionVoidAsync(_byps_ret);
			return _byps_ret;
		}
		public Object EndVoidFunctionVoid(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task VoidFunctionVoidTask() {
			await Task.Factory.FromAsync(BeginVoidFunctionVoid, EndVoidFunctionVoid, null);
		}
		
		public void SetBool(bool v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetBoolAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetBoolAsync(bool v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setBool req = new BRequest_RemotePrimitiveTypes_setBool();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetBool(bool v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetBoolAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetBool(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetBoolTask(bool v) {
			Task task = new Task((v) => {
                BeginSetBool(
            });
		}
		
		public void SetByte(byte v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetByteAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetByteAsync(byte v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setByte req = new BRequest_RemotePrimitiveTypes_setByte();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetByte(byte v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetByteAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetByte(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetByteTask(byte v) {
			await Task.Factory.FromAsync(BeginSetByte, EndSetByte, v, null);
		}
		
		public void SetChar(char v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetCharAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetCharAsync(char v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setChar req = new BRequest_RemotePrimitiveTypes_setChar();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetChar(char v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetCharAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetChar(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetCharTask(char v) {
			await Task.Factory.FromAsync(BeginSetChar, EndSetChar, v, null);
		}
		
		public void SetShort(short v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetShortAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetShortAsync(short v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setShort req = new BRequest_RemotePrimitiveTypes_setShort();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetShort(short v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetShortAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetShort(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetShortTask(short v) {
			await Task.Factory.FromAsync(BeginSetShort, EndSetShort, v, null);
		}
		
		public void SetInt(int v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetIntAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetIntAsync(int v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setInt req = new BRequest_RemotePrimitiveTypes_setInt();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetInt(int v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetIntAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetInt(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetIntTask(int v) {
			await Task.Factory.FromAsync(BeginSetInt, EndSetInt, v, null);
		}
		
		public void SetLong(long v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetLongAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetLongAsync(long v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setLong req = new BRequest_RemotePrimitiveTypes_setLong();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetLong(long v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetLongAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetLong(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetLongTask(long v) {
			await Task.Factory.FromAsync(BeginSetLong, EndSetLong, v, null);
		}
		
		public void SetFloat(float v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetFloatAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetFloatAsync(float v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setFloat req = new BRequest_RemotePrimitiveTypes_setFloat();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetFloat(float v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetFloatAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetFloat(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetFloatTask(float v) {
			await Task.Factory.FromAsync(BeginSetFloat, EndSetFloat, v, null);
		}
		
		public void SetDouble(double v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetDoubleAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetDoubleAsync(double v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setDouble req = new BRequest_RemotePrimitiveTypes_setDouble();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetDouble(double v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetDoubleAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetDouble(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetDoubleTask(double v) {
			await Task.Factory.FromAsync(BeginSetDouble, EndSetDouble, v, null);
		}
		
		public void SetString(String v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetStringAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetStringAsync(String v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setString req = new BRequest_RemotePrimitiveTypes_setString();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetString(String v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetStringAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetString(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetStringTask(String v) {
			await Task.Factory.FromAsync(BeginSetString, EndSetString, v, null);
		}
		
		public void SetPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetPrimitiveTypesAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetPrimitiveTypesAsync(com.wilutions.byps.test.api.prim.PrimitiveTypes v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setPrimitiveTypes req = new BRequest_RemotePrimitiveTypes_setPrimitiveTypes();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetPrimitiveTypesAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetPrimitiveTypes(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetPrimitiveTypesTask(com.wilutions.byps.test.api.prim.PrimitiveTypes v) {
			await Task.Factory.FromAsync(BeginSetPrimitiveTypes, EndSetPrimitiveTypes, v, null);
		}
		
		public void SetObject(Object v) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetObjectAsync(v, asyncResult);
			asyncResult.GetResult();			
		}
		public void SetObjectAsync(Object v, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_setObject req = new BRequest_RemotePrimitiveTypes_setObject();			
			req._v = v;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetObject(Object v, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SetObjectAsync(v, _byps_ret);
			return _byps_ret;
		}
		public Object EndSetObject(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SetObjectTask(Object v) {
			await Task.Factory.FromAsync(BeginSetObject, EndSetObject, v, null);
		}
		
		public bool GetBool() {
			BSyncResult<bool> asyncResult = new BSyncResult<bool>();			
			GetBoolAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetBoolAsync(BAsyncResult<bool> asyncResult) {
			BRequest_RemotePrimitiveTypes_getBool req = new BRequest_RemotePrimitiveTypes_getBool();			
			BAsyncResultReceiveMethod<bool> outerResult = new BAsyncResultReceiveMethod<bool>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetBool(AsyncCallback callback, object state){
			BAsyncProgModel<bool> _byps_ret = new BAsyncProgModel<bool>(callback, state);
			GetBoolAsync(_byps_ret);
			return _byps_ret;
		}
		public bool EndGetBool(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<bool>)asyncResult).Result;
		}
		public async Task<bool> GetBoolTask() {
			return await Task<bool>.Factory.FromAsync(BeginGetBool, EndGetBool, null);
		}
		
		public byte GetByte() {
			BSyncResult<byte> asyncResult = new BSyncResult<byte>();			
			GetByteAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetByteAsync(BAsyncResult<byte> asyncResult) {
			BRequest_RemotePrimitiveTypes_getByte req = new BRequest_RemotePrimitiveTypes_getByte();			
			BAsyncResultReceiveMethod<byte> outerResult = new BAsyncResultReceiveMethod<byte>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetByte(AsyncCallback callback, object state){
			BAsyncProgModel<byte> _byps_ret = new BAsyncProgModel<byte>(callback, state);
			GetByteAsync(_byps_ret);
			return _byps_ret;
		}
		public byte EndGetByte(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<byte>)asyncResult).Result;
		}
		public async Task<byte> GetByteTask() {
			return await Task<byte>.Factory.FromAsync(BeginGetByte, EndGetByte, null);
		}
		
		public char GetChar() {
			BSyncResult<char> asyncResult = new BSyncResult<char>();			
			GetCharAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetCharAsync(BAsyncResult<char> asyncResult) {
			BRequest_RemotePrimitiveTypes_getChar req = new BRequest_RemotePrimitiveTypes_getChar();			
			BAsyncResultReceiveMethod<char> outerResult = new BAsyncResultReceiveMethod<char>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetChar(AsyncCallback callback, object state){
			BAsyncProgModel<char> _byps_ret = new BAsyncProgModel<char>(callback, state);
			GetCharAsync(_byps_ret);
			return _byps_ret;
		}
		public char EndGetChar(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<char>)asyncResult).Result;
		}
		public async Task<char> GetCharTask() {
			return await Task<char>.Factory.FromAsync(BeginGetChar, EndGetChar, null);
		}
		
		public short GetShort() {
			BSyncResult<short> asyncResult = new BSyncResult<short>();			
			GetShortAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetShortAsync(BAsyncResult<short> asyncResult) {
			BRequest_RemotePrimitiveTypes_getShort req = new BRequest_RemotePrimitiveTypes_getShort();			
			BAsyncResultReceiveMethod<short> outerResult = new BAsyncResultReceiveMethod<short>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetShort(AsyncCallback callback, object state){
			BAsyncProgModel<short> _byps_ret = new BAsyncProgModel<short>(callback, state);
			GetShortAsync(_byps_ret);
			return _byps_ret;
		}
		public short EndGetShort(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<short>)asyncResult).Result;
		}
		public async Task<short> GetShortTask() {
			return await Task<short>.Factory.FromAsync(BeginGetShort, EndGetShort, null);
		}
		
		public int GetInt() {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			GetIntAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetIntAsync(BAsyncResult<int> asyncResult) {
			BRequest_RemotePrimitiveTypes_getInt req = new BRequest_RemotePrimitiveTypes_getInt();			
			BAsyncResultReceiveMethod<int> outerResult = new BAsyncResultReceiveMethod<int>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetInt(AsyncCallback callback, object state){
			BAsyncProgModel<int> _byps_ret = new BAsyncProgModel<int>(callback, state);
			GetIntAsync(_byps_ret);
			return _byps_ret;
		}
		public int EndGetInt(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<int>)asyncResult).Result;
		}
		public async Task<int> GetIntTask() {
			return await Task<int>.Factory.FromAsync(BeginGetInt, EndGetInt, null);
		}
		
		public long GetLong() {
			BSyncResult<long> asyncResult = new BSyncResult<long>();			
			GetLongAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetLongAsync(BAsyncResult<long> asyncResult) {
			BRequest_RemotePrimitiveTypes_getLong req = new BRequest_RemotePrimitiveTypes_getLong();			
			BAsyncResultReceiveMethod<long> outerResult = new BAsyncResultReceiveMethod<long>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetLong(AsyncCallback callback, object state){
			BAsyncProgModel<long> _byps_ret = new BAsyncProgModel<long>(callback, state);
			GetLongAsync(_byps_ret);
			return _byps_ret;
		}
		public long EndGetLong(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<long>)asyncResult).Result;
		}
		public async Task<long> GetLongTask() {
			return await Task<long>.Factory.FromAsync(BeginGetLong, EndGetLong, null);
		}
		
		public float GetFloat() {
			BSyncResult<float> asyncResult = new BSyncResult<float>();			
			GetFloatAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetFloatAsync(BAsyncResult<float> asyncResult) {
			BRequest_RemotePrimitiveTypes_getFloat req = new BRequest_RemotePrimitiveTypes_getFloat();			
			BAsyncResultReceiveMethod<float> outerResult = new BAsyncResultReceiveMethod<float>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetFloat(AsyncCallback callback, object state){
			BAsyncProgModel<float> _byps_ret = new BAsyncProgModel<float>(callback, state);
			GetFloatAsync(_byps_ret);
			return _byps_ret;
		}
		public float EndGetFloat(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<float>)asyncResult).Result;
		}
		public async Task<float> GetFloatTask() {
			return await Task<float>.Factory.FromAsync(BeginGetFloat, EndGetFloat, null);
		}
		
		public double GetDouble() {
			BSyncResult<double> asyncResult = new BSyncResult<double>();			
			GetDoubleAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetDoubleAsync(BAsyncResult<double> asyncResult) {
			BRequest_RemotePrimitiveTypes_getDouble req = new BRequest_RemotePrimitiveTypes_getDouble();			
			BAsyncResultReceiveMethod<double> outerResult = new BAsyncResultReceiveMethod<double>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetDouble(AsyncCallback callback, object state){
			BAsyncProgModel<double> _byps_ret = new BAsyncProgModel<double>(callback, state);
			GetDoubleAsync(_byps_ret);
			return _byps_ret;
		}
		public double EndGetDouble(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<double>)asyncResult).Result;
		}
		public async Task<double> GetDoubleTask() {
			return await Task<double>.Factory.FromAsync(BeginGetDouble, EndGetDouble, null);
		}
		
		public String GetString() {
			BSyncResult<String> asyncResult = new BSyncResult<String>();			
			GetStringAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetStringAsync(BAsyncResult<String> asyncResult) {
			BRequest_RemotePrimitiveTypes_getString req = new BRequest_RemotePrimitiveTypes_getString();			
			BAsyncResultReceiveMethod<String> outerResult = new BAsyncResultReceiveMethod<String>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetString(AsyncCallback callback, object state){
			BAsyncProgModel<String> _byps_ret = new BAsyncProgModel<String>(callback, state);
			GetStringAsync(_byps_ret);
			return _byps_ret;
		}
		public String EndGetString(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<String>)asyncResult).Result;
		}
		public async Task<String> GetStringTask() {
			return await Task<String>.Factory.FromAsync(BeginGetString, EndGetString, null);
		}
		
		public com.wilutions.byps.test.api.prim.PrimitiveTypes GetPrimitiveTypes() {
			BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes> asyncResult = new BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes>();			
			GetPrimitiveTypesAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetPrimitiveTypesAsync(BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes> asyncResult) {
			BRequest_RemotePrimitiveTypes_getPrimitiveTypes req = new BRequest_RemotePrimitiveTypes_getPrimitiveTypes();			
			BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPrimitiveTypes(AsyncCallback callback, object state){
			BAsyncProgModel<com.wilutions.byps.test.api.prim.PrimitiveTypes> _byps_ret = new BAsyncProgModel<com.wilutions.byps.test.api.prim.PrimitiveTypes>(callback, state);
			GetPrimitiveTypesAsync(_byps_ret);
			return _byps_ret;
		}
		public com.wilutions.byps.test.api.prim.PrimitiveTypes EndGetPrimitiveTypes(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<com.wilutions.byps.test.api.prim.PrimitiveTypes>)asyncResult).Result;
		}
		public async Task<com.wilutions.byps.test.api.prim.PrimitiveTypes> GetPrimitiveTypesTask() {
			return await Task<com.wilutions.byps.test.api.prim.PrimitiveTypes>.Factory.FromAsync(BeginGetPrimitiveTypes, EndGetPrimitiveTypes, null);
		}
		
		public Object GetObject() {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			GetObjectAsync(asyncResult);
			return asyncResult.GetResult();			
		}
		public void GetObjectAsync(BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_getObject req = new BRequest_RemotePrimitiveTypes_getObject();			
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetObject(AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			GetObjectAsync(_byps_ret);
			return _byps_ret;
		}
		public Object EndGetObject(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task<Object> GetObjectTask() {
			return await Task<Object>.Factory.FromAsync(BeginGetObject, EndGetObject, null);
		}
		
		public void SendAllTypes(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SendAllTypesAsync(b, c, s, i, l, f, d, str, pt, o, asyncResult);
			asyncResult.GetResult();			
		}
		public void SendAllTypesAsync(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o, BAsyncResult<Object> asyncResult) {
			BRequest_RemotePrimitiveTypes_sendAllTypes req = new BRequest_RemotePrimitiveTypes_sendAllTypes();			
			req._b = b;
			req._c = c;
			req._s = s;
			req._i = i;
			req._l = l;
			req._f = f;
			req._d = d;
			req._str = str;
			req._pt = pt;
			req._o = o;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSendAllTypes(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			SendAllTypesAsync(b, c, s, i, l, f, d, str, pt, o, _byps_ret);
			return _byps_ret;
		}
		public Object EndSendAllTypes(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		public async Task SendAllTypesTask(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o) 
    	}
		
		public int Add(int a, int b) {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			AddAsync(a, b, asyncResult);
			return asyncResult.GetResult();			
		}
		public void AddAsync(int a, int b, BAsyncResult<int> asyncResult) {
			BRequest_RemotePrimitiveTypes_add req = new BRequest_RemotePrimitiveTypes_add();			
			req._a = a;
			req._b = b;
			BAsyncResultReceiveMethod<int> outerResult = new BAsyncResultReceiveMethod<int>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginAdd(int a, int b, AsyncCallback callback, object state){
			BAsyncProgModel<int> _byps_ret = new BAsyncProgModel<int>(callback, state);
			AddAsync(a, b, _byps_ret);
			return _byps_ret;
		}
		public int EndAdd(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<int>)asyncResult).Result;
		}
		public async Task<int> AddTask(int a, int b) {
			return await Task<int>.Factory.FromAsync(BeginAdd, EndAdd, a, b, null);
		}
		
		
	}
}

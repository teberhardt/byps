﻿using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BStub_RemoteInlineInstance : BStub, RemoteInlineInstance, BSerializable {	
		
		public readonly static long serialVersionUID = 1206670536L;
		
		public BStub_RemoteInlineInstance(BTransport transport)
			: base(transport) {}			
		
		public void SetActor(com.wilutions.byps.test.api.inl.Actor act) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetActor(act, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetActor(com.wilutions.byps.test.api.inl.Actor act, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setActor req = new BRequest_RemoteInlineInstance_setActor();			
			req._act = act;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetActor(com.wilutions.byps.test.api.inl.Actor act, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetActor(act, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetActor(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public com.wilutions.byps.test.api.inl.Actor GetActor() {
			BSyncResult<com.wilutions.byps.test.api.inl.Actor> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Actor>();			
			async_GetActor(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetActor(BAsyncResult<com.wilutions.byps.test.api.inl.Actor> asyncResult) {
			BRequest_RemoteInlineInstance_getActor req = new BRequest_RemoteInlineInstance_getActor();			
			BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Actor> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Actor>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetActor(AsyncCallback callback, object state){
			BAsyncProgModel<com.wilutions.byps.test.api.inl.Actor> _byps_ret = new BAsyncProgModel<com.wilutions.byps.test.api.inl.Actor>(callback, state);
			async_GetActor(_byps_ret);
			return _byps_ret;
		}
		public 		com.wilutions.byps.test.api.inl.Actor EndGetActor(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<com.wilutions.byps.test.api.inl.Actor>)asyncResult).Result;
		}
		
		public void SetPoint2DArray1dim(com.wilutions.byps.test.api.inl.Point2D[] pointArray) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetPoint2DArray1dim(pointArray, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetPoint2DArray1dim(com.wilutions.byps.test.api.inl.Point2D[] pointArray, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setPoint2DArray1dim req = new BRequest_RemoteInlineInstance_setPoint2DArray1dim();			
			req._pointArray = pointArray;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPoint2DArray1dim(com.wilutions.byps.test.api.inl.Point2D[] pointArray, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetPoint2DArray1dim(pointArray, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetPoint2DArray1dim(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public com.wilutions.byps.test.api.inl.Point2D[] GetPoint2DArray1dim() {
			BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]>();			
			async_GetPoint2DArray1dim(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetPoint2DArray1dim(BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult) {
			BRequest_RemoteInlineInstance_getPoint2DArray1dim req = new BRequest_RemoteInlineInstance_getPoint2DArray1dim();			
			BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPoint2DArray1dim(AsyncCallback callback, object state){
			BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[]> _byps_ret = new BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[]>(callback, state);
			async_GetPoint2DArray1dim(_byps_ret);
			return _byps_ret;
		}
		public 		com.wilutions.byps.test.api.inl.Point2D[] EndGetPoint2DArray1dim(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[]>)asyncResult).Result;
		}
		
		public void SetPoint2DArray4dim(com.wilutions.byps.test.api.inl.Point2D[,,,] pointArray) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetPoint2DArray4dim(pointArray, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetPoint2DArray4dim(com.wilutions.byps.test.api.inl.Point2D[,,,] pointArray, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setPoint2DArray4dim req = new BRequest_RemoteInlineInstance_setPoint2DArray4dim();			
			req._pointArray = pointArray;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPoint2DArray4dim(com.wilutions.byps.test.api.inl.Point2D[,,,] pointArray, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetPoint2DArray4dim(pointArray, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetPoint2DArray4dim(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public com.wilutions.byps.test.api.inl.Point2D[,,,] GetPoint2DArray4dim() {
			BSyncResult<com.wilutions.byps.test.api.inl.Point2D[,,,]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Point2D[,,,]>();			
			async_GetPoint2DArray4dim(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetPoint2DArray4dim(BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[,,,]> asyncResult) {
			BRequest_RemoteInlineInstance_getPoint2DArray4dim req = new BRequest_RemoteInlineInstance_getPoint2DArray4dim();			
			BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[,,,]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[,,,]>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPoint2DArray4dim(AsyncCallback callback, object state){
			BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[,,,]> _byps_ret = new BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[,,,]>(callback, state);
			async_GetPoint2DArray4dim(_byps_ret);
			return _byps_ret;
		}
		public 		com.wilutions.byps.test.api.inl.Point2D[,,,] EndGetPoint2DArray4dim(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<com.wilutions.byps.test.api.inl.Point2D[,,,]>)asyncResult).Result;
		}
		
		public void SetPoint2DList(IList<com.wilutions.byps.test.api.inl.Point2D> pointList) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetPoint2DList(pointList, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetPoint2DList(IList<com.wilutions.byps.test.api.inl.Point2D> pointList, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setPoint2DList req = new BRequest_RemoteInlineInstance_setPoint2DList();			
			req._pointList = pointList;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPoint2DList(IList<com.wilutions.byps.test.api.inl.Point2D> pointList, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetPoint2DList(pointList, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetPoint2DList(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public IList<com.wilutions.byps.test.api.inl.Point2D> GetPoint2DList() {
			BSyncResult<IList<com.wilutions.byps.test.api.inl.Point2D>> asyncResult = new BSyncResult<IList<com.wilutions.byps.test.api.inl.Point2D>>();			
			async_GetPoint2DList(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetPoint2DList(BAsyncResult<IList<com.wilutions.byps.test.api.inl.Point2D>> asyncResult) {
			BRequest_RemoteInlineInstance_getPoint2DList req = new BRequest_RemoteInlineInstance_getPoint2DList();			
			BAsyncResultReceiveMethod<IList<com.wilutions.byps.test.api.inl.Point2D>> outerResult = new BAsyncResultReceiveMethod<IList<com.wilutions.byps.test.api.inl.Point2D>>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPoint2DList(AsyncCallback callback, object state){
			BAsyncProgModel<IList<com.wilutions.byps.test.api.inl.Point2D>> _byps_ret = new BAsyncProgModel<IList<com.wilutions.byps.test.api.inl.Point2D>>(callback, state);
			async_GetPoint2DList(_byps_ret);
			return _byps_ret;
		}
		public 		IList<com.wilutions.byps.test.api.inl.Point2D> EndGetPoint2DList(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<IList<com.wilutions.byps.test.api.inl.Point2D>>)asyncResult).Result;
		}
		
		public void SetPoint2DListList(IList<IList<com.wilutions.byps.test.api.inl.Point2D>> pointListList) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetPoint2DListList(pointListList, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetPoint2DListList(IList<IList<com.wilutions.byps.test.api.inl.Point2D>> pointListList, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setPoint2DListList req = new BRequest_RemoteInlineInstance_setPoint2DListList();			
			req._pointListList = pointListList;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPoint2DListList(IList<IList<com.wilutions.byps.test.api.inl.Point2D>> pointListList, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetPoint2DListList(pointListList, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetPoint2DListList(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public IList<IList<com.wilutions.byps.test.api.inl.Point2D>> GetPoint2DListList() {
			BSyncResult<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>> asyncResult = new BSyncResult<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>>();			
			async_GetPoint2DListList(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetPoint2DListList(BAsyncResult<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>> asyncResult) {
			BRequest_RemoteInlineInstance_getPoint2DListList req = new BRequest_RemoteInlineInstance_getPoint2DListList();			
			BAsyncResultReceiveMethod<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>> outerResult = new BAsyncResultReceiveMethod<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPoint2DListList(AsyncCallback callback, object state){
			BAsyncProgModel<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>> _byps_ret = new BAsyncProgModel<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>>(callback, state);
			async_GetPoint2DListList(_byps_ret);
			return _byps_ret;
		}
		public 		IList<IList<com.wilutions.byps.test.api.inl.Point2D>> EndGetPoint2DListList(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<IList<IList<com.wilutions.byps.test.api.inl.Point2D>>>)asyncResult).Result;
		}
		
		public void SetPoint2DMap(IDictionary<int,com.wilutions.byps.test.api.inl.Point2D> pointMap) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			async_SetPoint2DMap(pointMap, asyncResult);
			asyncResult.GetResult();			
		}
		public void async_SetPoint2DMap(IDictionary<int,com.wilutions.byps.test.api.inl.Point2D> pointMap, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteInlineInstance_setPoint2DMap req = new BRequest_RemoteInlineInstance_setPoint2DMap();			
			req._pointMap = pointMap;
			BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginSetPoint2DMap(IDictionary<int,com.wilutions.byps.test.api.inl.Point2D> pointMap, AsyncCallback callback, object state){
			BAsyncProgModel<Object> _byps_ret = new BAsyncProgModel<Object>(callback, state);
			async_SetPoint2DMap(pointMap, _byps_ret);
			return _byps_ret;
		}
		public 		Object EndSetPoint2DMap(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<Object>)asyncResult).Result;
		}
		
		public IDictionary<int,com.wilutions.byps.test.api.inl.Point2D> GetPoint2DMap() {
			BSyncResult<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>> asyncResult = new BSyncResult<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>>();			
			async_GetPoint2DMap(asyncResult);
			return asyncResult.GetResult();			
		}
		public void async_GetPoint2DMap(BAsyncResult<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>> asyncResult) {
			BRequest_RemoteInlineInstance_getPoint2DMap req = new BRequest_RemoteInlineInstance_getPoint2DMap();			
			BAsyncResultReceiveMethod<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>> outerResult = new BAsyncResultReceiveMethod<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>>(asyncResult);
			transport.send(req, outerResult);
		}
		public IAsyncResult BeginGetPoint2DMap(AsyncCallback callback, object state){
			BAsyncProgModel<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>> _byps_ret = new BAsyncProgModel<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>>(callback, state);
			async_GetPoint2DMap(_byps_ret);
			return _byps_ret;
		}
		public 		IDictionary<int,com.wilutions.byps.test.api.inl.Point2D> EndGetPoint2DMap(IAsyncResult asyncResult) {
			return ((BAsyncProgModel<IDictionary<int,com.wilutions.byps.test.api.inl.Point2D>>)asyncResult).Result;
		}
		
		
	}
}
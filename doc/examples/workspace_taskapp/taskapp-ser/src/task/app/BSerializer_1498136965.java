package task.app;

/*
 * Serializer for task.app.BRequest_TaskService_addTask
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1498136965 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1498136965();
	
	public BSerializer_1498136965() {
		super(1498136965);
	}
	
	public BSerializer_1498136965(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_TaskService_addTask obj = (BRequest_TaskService_addTask)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.task, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_TaskService_addTask obj = (BRequest_TaskService_addTask)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_addTask()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.task = (task.app.TaskInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}

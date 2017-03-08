package cn.bishiti.base.test.rpc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class RpcHandler {

	ConcurrentHashMap<String, Object> registered=new ConcurrentHashMap<String, Object>(128);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public RpcResponse handler(RpcCommand command){
		String className=command.getClassName();
		RpcResponse response=new RpcResponse();
		try{
			Object obj=registered.get(className);
			String argTypes[]=command.getArgumetsType();
			Class aClass=Class.forName(className);
			List<Class> argTypeList=new ArrayList<Class>(argTypes.length);
			for(String s:argTypes){
				argTypeList.add(Class.forName(s));
			}
			Method method=aClass.getMethod(command.getMethodName(),argTypeList.toArray(new Class[argTypeList.size()]));
			Object object=method.invoke(obj, command.getParams());
			response.setResult(object);
		}catch(Exception e){
			e.printStackTrace();
			response.setException(true);
			response.setException(e);
		}
		
		return response;
	}
	
	@SuppressWarnings("rawtypes")
	public void regist(Class interfa,Object object){
		registered.put(interfa.getName(), object);
	}
}

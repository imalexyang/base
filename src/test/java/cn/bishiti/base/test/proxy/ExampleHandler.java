package cn.bishiti.base.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ExampleHandler implements InvocationHandler{

	private Object obj;
	
	public ExampleHandler(Object obj){
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		Object result=method.invoke(obj, args);
		System.out.println("after");
		return result;
	}

}

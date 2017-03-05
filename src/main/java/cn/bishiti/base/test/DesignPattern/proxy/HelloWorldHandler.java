package cn.bishiti.base.test.DesignPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldHandler implements InvocationHandler{

	private Object obj;
	
	public HelloWorldHandler(Object obj){
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("hello before");
		Object result = method.invoke(obj, args);
		System.out.println("hello after");
		return result;
	}

}

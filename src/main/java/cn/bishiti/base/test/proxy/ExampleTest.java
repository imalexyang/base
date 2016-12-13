package cn.bishiti.base.test.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class ExampleTest {
	
	@Test
	public void test(){
		IHelloWorld hw=new HelloWorld();
		ExampleHandler handler=new ExampleHandler(hw);
		
		IHelloWorld helloWorld=(IHelloWorld)Proxy.newProxyInstance(hw.getClass().getClassLoader(), hw.getClass().getInterfaces(), handler);
		helloWorld.example();
		
		
	}
	
}

package cn.bishiti.base.test.DesignPattern.proxy;

import java.lang.reflect.Proxy;

public class HelloWorldTest {

	public static void main(String args[]){
		IHelloWorld hw=new HelloWorld();
		HelloWorldHandler handler=new HelloWorldHandler(hw);
		IHelloWorld helloWorld = (IHelloWorld) Proxy.newProxyInstance(hw.getClass().getClassLoader(), hw.getClass().getInterfaces(), handler);
		helloWorld.say();
	}
	
}

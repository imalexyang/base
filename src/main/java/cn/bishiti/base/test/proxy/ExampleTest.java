package cn.bishiti.base.test.proxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ExampleTest {
	
	@Test
	public void test(){
		IHelloWorld hw=new HelloWorld();
		ExampleHandler handler=new ExampleHandler(hw);
		
		IHelloWorld helloWorld=(IHelloWorld)Proxy.newProxyInstance(hw.getClass().getClassLoader(), hw.getClass().getInterfaces(), handler);
		helloWorld.example();
		
		ThreadPoolExecutor  poolExecutor=new ThreadPoolExecutor(2, 4, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3), new ThreadPoolExecutor.DiscardOldestPolicy());
		
		//poolExecutor.execute(command);
	}
	
}

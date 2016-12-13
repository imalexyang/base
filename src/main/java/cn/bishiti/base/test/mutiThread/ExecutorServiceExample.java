package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executorSerivce=Executors.newFixedThreadPool(10);
		executorSerivce.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Asynchronous task");
				
			}
		});
		
		executorSerivce.shutdown();
	}

}

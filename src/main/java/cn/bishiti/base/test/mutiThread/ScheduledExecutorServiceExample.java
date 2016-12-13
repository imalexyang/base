package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(5);
		
		ScheduledFuture scheduledFuture=scheduledExecutorService.schedule(
				new Callable() {
					@Override
					public Object call() throws Exception {
						System.out.println("Executed!");
						return "Called!";
					}
				},
				5,
				TimeUnit.SECONDS);
	}

}

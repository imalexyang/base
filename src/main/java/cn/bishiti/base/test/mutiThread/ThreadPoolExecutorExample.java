package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int corePoolSize=5;
		int maxPoolSize=10;
		long keepAliveTime=5000;
		
		@SuppressWarnings("unused")
		ExecutorService threadPoolExecutor = 
				new ThreadPoolExecutor(
						corePoolSize, 
						maxPoolSize, 
						keepAliveTime, 
						TimeUnit.MILLISECONDS, 
						new LinkedBlockingQueue<Runnable>()
						);
		
		//threadPoolExecutor.execute(command);
	}

}

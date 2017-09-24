package cn.bishiti.base.test.mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService pool=Executors.newFixedThreadPool(2);
		List<Future<Integer>> futureList=new ArrayList<Future<Integer>>();
		for(int i=0;i<5;i++){
			Future<Integer> future=pool.submit(new TaskThread());
			futureList.add(future);
		}		
		pool.shutdown();
		
		//Thread.sleep(1000);
		System.out.println("主线程在执行任务");
		
		for(Future<Integer> future:futureList){
			System.out.println("返回的结果："+future.get());
		}
	}

}

class TaskThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("子线程在进行计算");
		Thread.sleep(1000);
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=i;
		}
		return sum;
	}
}
package cn.bishiti.base.test.mutiThread; 

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Object> queue=new ArrayBlockingQueue<Object>(1024);
		
		Producer producer=new Producer(queue);
		Consumer consumer=new Consumer(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
		
		Thread.sleep(4000);
		System.out.println("The End");
	}

}

  
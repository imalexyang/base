package cn.bishiti.base.test.mutiThread; 

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	protected BlockingQueue<Object> queue=null;
	
	public Producer(BlockingQueue<Object> queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {
		 try{
			 queue.put(1);
			 Thread.sleep(1000);
			 queue.put(2);
			 Thread.sleep(1000);
			 queue.put(3);
		 }catch(InterruptedException ie){
			 ie.printStackTrace();
		 }
	}
}

  
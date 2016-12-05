package cn.bishiti.base.test.mutiThread; 

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	protected BlockingQueue<Object> queue=null;
	
	public Consumer (BlockingQueue<Object> queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {
		try{			
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}

}

  
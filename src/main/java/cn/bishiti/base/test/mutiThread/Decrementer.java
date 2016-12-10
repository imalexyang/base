package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable{

	private CountDownLatch latch=null;
	
	public Decrementer(CountDownLatch latch){
		this.latch=latch;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.latch.countDown();
			
			Thread.sleep(1000);
			this.latch.countDown();
			
			Thread.sleep(1000);
			this.latch.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable{

	private CountDownLatch latch=null;
	
	public Waiter(CountDownLatch latch){
		this.latch=latch;
	}
	
	@Override
	public void run() {
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Waiter Released");
	}

}

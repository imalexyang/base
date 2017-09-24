package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(3);
		
		Waiter waiter=new Waiter(latch);
		Decrementer decrementer=new Decrementer(latch);

		new Thread(waiter).start();
		new Thread(decrementer).start();
		
		Thread.sleep(4000);
	}

}

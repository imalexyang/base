package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	public static void main(String args[]) throws InterruptedException{
		Semaphore semaphore=new Semaphore(1);		
		semaphore.acquire();		
		semaphore.release();
	}
}

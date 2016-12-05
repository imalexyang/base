package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeExample {

	public static void main(String args[]) throws InterruptedException{
		BlockingDeque<String> deque=new LinkedBlockingDeque<String>(1024); 
		
		deque.addFirst("1");
		deque.addLast("2");
		
		System.out.println(deque.takeLast());
		System.out.println(deque.takeFirst());
	}
	
}

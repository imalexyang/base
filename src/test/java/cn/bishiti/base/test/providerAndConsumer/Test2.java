package cn.bishiti.base.test.providerAndConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list=new ArrayList<Integer>();
		Lock lock=new ReentrantLock();
		Condition full=lock.newCondition();
		Condition empty=lock.newCondition();
		Provider2 p=new Provider2(list,lock,full,empty);
		Consumer2 c=new Consumer2(list,lock,full,empty);
		
		new Thread(c).start();
		Thread.sleep(2000);
		new Thread(p).start();
	}
}

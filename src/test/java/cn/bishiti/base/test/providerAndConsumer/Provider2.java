package cn.bishiti.base.test.providerAndConsumer;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Provider2 implements Runnable{

	private List<Integer> list;
	
	private Lock lock;
	
	private Condition full;
	
	private Condition empty;
	
	Provider2(List<Integer> list,Lock lock,Condition full,Condition empty){
		this.list=list;
		this.lock=lock;
		this.full=full;
		this.empty=empty;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true){
			try{
				lock.lock();
				if(list.size()==5){					
					full.await();
				}
				list.add(i++);
				System.out.println("生产："+i);
				Thread.sleep(1000);
				empty.signal();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	}

}

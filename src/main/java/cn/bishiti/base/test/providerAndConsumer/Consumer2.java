package cn.bishiti.base.test.providerAndConsumer;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer2 implements Runnable{

	private List<Integer> list;
	
	private Lock lock;
	
	private Condition full;
	
	private Condition empty;
	
	Consumer2(List<Integer> list,Lock lock,Condition full,Condition empty){
		this.list=list;
		this.lock=lock;
		this.full=full;
		this.empty=empty;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				lock.lock();
				if(list.size()==0){					
					empty.await();
				}
				System.out.println("消费："+list.get(0));
				list.remove(0);
				Thread.sleep(1000);
				full.signal();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		}
	}

}

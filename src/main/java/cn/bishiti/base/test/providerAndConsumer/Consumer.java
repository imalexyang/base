package cn.bishiti.base.test.providerAndConsumer;

import java.util.List;

public class Consumer implements Runnable{

	private List<Integer> list=null;
	
	public Consumer(List<Integer> list){
		this.list=list;
	}
			
	@Override
	public void run() {
		synchronized (list) {
			try{
				while(true){					
					if(list.size()==0){
						list.wait();
					}
					System.out.println("获取"+list.get(0));
					list.remove(0);
					list.notify();
					Thread.sleep(1000);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

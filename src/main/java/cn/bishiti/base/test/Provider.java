package cn.bishiti.base.test;

import java.util.List;

public class Provider implements Runnable{

	private List<Integer> list=null;
	
	public Provider(List<Integer> list){
		this.list=list;
	}
	
	@Override
	public void run() {
		synchronized (list) {
			try{
				int i=0;
				while(true){
					if(list.size()==5){
						list.wait();
					}
					System.out.println("放入 "+ i);
					list.add(i++);
					list.notify();
					Thread.sleep(1000);
				}				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

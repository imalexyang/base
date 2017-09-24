package cn.bishiti.base.test.mutiThread;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable{

	@SuppressWarnings("rawtypes")
	Exchanger exchanger	=null;
	Object object=null;
	
	@SuppressWarnings("rawtypes")
	public ExchangerRunnable(Exchanger exchanger,Object object){
		this.exchanger=exchanger;
		this.object=object;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {		
		try {
			Object previous=this.object;
			this.object=this.exchanger.exchange(this.object);
			System.out.println(
					Thread.currentThread().getName()
					+" exchanger "+previous+" for "+this.object
					);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

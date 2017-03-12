package cn.bishiti.base.test.mutiThread;

public class NotifyWaite implements Runnable{
	
	String handler;
	
	NotifyWaite(String handler){
		this.handler=handler;
	}
	
	@Override
	public void run() {
		synchronized (handler) {
			try {
				System.out.println(Thread.currentThread().getName()+" waite");
				handler.wait();
				
				System.out.println(Thread.currentThread().getName()+" run");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
package cn.bishiti.base.test.mutiThread;

public class NotifyAllThread implements Runnable{
	
	String handler;
	
	NotifyAllThread(String handler){
		this.handler=handler;
	}
	
	@Override
	public void run() {
		synchronized (handler) {
			handler.notifyAll();
			System.out.println(Thread.currentThread().getName()+" notifyAll");
		}
	}
	
}

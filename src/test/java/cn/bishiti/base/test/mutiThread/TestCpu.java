package cn.bishiti.base.test.mutiThread;

public class TestCpu implements Runnable{
	
	String handle;
	
	TestCpu(String handle){
		this.handle=handle;
	}
	
	public void run() {
		/*synchronized (handle) {*/
			try {
				System.out.println("befor");
				Thread.sleep(3000);
				System.out.println("after");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*}*/		
	}

}

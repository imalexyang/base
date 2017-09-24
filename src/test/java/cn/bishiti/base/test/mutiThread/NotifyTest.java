package cn.bishiti.base.test.mutiThread;

public class NotifyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String handler="test";
		
		NotifyWaite nw1=new NotifyWaite(handler);
		NotifyWaite nw2=new NotifyWaite(handler);		
		NotifyAllThread na=new NotifyAllThread(handler);
		
		Thread t1=new Thread(nw1);
		t1.setName("t1");		
		Thread t2=new Thread(nw2);
		t2.setName("t2");		
		t1.start();
		t2.start();
		
		Thread.sleep(100);
		Thread t3=new Thread(na);
		t3.setName("t3");
		t3.start();
	}

}

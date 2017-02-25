package cn.bishiti.base.test.mutiThread;

public class TestString {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StringBuffer sbf=new StringBuffer("sbf");
		StringBuilder sbd=new StringBuilder("sbd");
		
		Thread t1=new Thread(new StringBufferTest(sbf));
		Thread t2=new Thread(new StringBufferTest(sbf));		
		
		Thread t3=new Thread(new StringBuilderTest(sbd));
		Thread t4=new Thread(new StringBuilderTest(sbd));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		
		System.out.println("abc");
		//验证StringBuffer 和StringBuilder 线程安全性
	}

}

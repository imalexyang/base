package cn.bishiti.base.test.mutiThread;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbf=new StringBuffer("sbf");
		StringBuilder sbd=new StringBuilder("sbd");
		
		new Thread(new StringBufferTest(sbf)).start();
		new Thread(new StringBufferTest(sbf)).start();		
		
		new Thread(new StringBuilderTest(sbd)).start();
		new Thread(new StringBuilderTest(sbd)).start();
		
		//验证StringBuffer 和StringBuilder 线程安全性
	}

}

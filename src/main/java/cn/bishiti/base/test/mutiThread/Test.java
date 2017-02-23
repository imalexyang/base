package cn.bishiti.base.test.mutiThread;

public class Test {
	public static void main(String args[]){
		String handel="test";
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
		new Thread(new TestCpu(handel)).start();
	}
}

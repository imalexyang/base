package cn.bishiti.base.test.mutiThread;

public class StringBufferTest implements Runnable{

	private StringBuffer sb;
	
	StringBufferTest(StringBuffer sb){
		this.sb=sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			sb.append("A");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("StringBuffer:"+sb.length());
	}

}

package cn.bishiti.base.test.mutiThread;

public class StringBuilderTest implements Runnable{

	private StringBuilder sb;
	
	StringBuilderTest(StringBuilder sb){
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
		System.out.println("StringBuilder:"+sb.length());
	}

}

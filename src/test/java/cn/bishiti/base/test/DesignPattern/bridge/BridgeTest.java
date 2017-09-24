package cn.bishiti.base.test.DesignPattern.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bridge bridge=new MyBridge();
		
		Sourceable source1=new SourceSub1();
		bridge.setSource(source1);
		bridge.method();
		
		Sourceable source2=new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}

}

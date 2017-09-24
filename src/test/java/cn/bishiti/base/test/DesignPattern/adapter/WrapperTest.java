package cn.bishiti.base.test.DesignPattern.adapter;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source1=new SourceSub1();
		Sourceable source2=new SourceSub2();
		
		source1.method1();
		source1.method2();
		
		source2.method1();
		source2.method2();
	}

}

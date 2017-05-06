package cn.bishiti.base.test.DesignPattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Targetable target=new Adapter();
		target.method1();
		target.method2();
		
		Targetable target2=new Wrapper(new Source());
		target2.method1();
		target2.method2();
	}

}

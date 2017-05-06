package cn.bishiti.base.test.DesignPattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Targetable target=new Adapter();
		target.method1();
		target.method2();
	}

}

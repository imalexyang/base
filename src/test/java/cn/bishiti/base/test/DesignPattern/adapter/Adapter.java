package cn.bishiti.base.test.DesignPattern.adapter;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is a targetable method.");
	}

}

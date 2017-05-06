package cn.bishiti.base.test.DesignPattern.adapter;

public class Wrapper implements Targetable{

	private Source source;
	
	public Wrapper(Source source){
		this.source=source;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is a target method2.");
	}

}

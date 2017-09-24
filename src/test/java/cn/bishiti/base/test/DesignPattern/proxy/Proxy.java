package cn.bishiti.base.test.DesignPattern.proxy;

public class Proxy implements Sourceable{

	private Source source;
	
	public Proxy(){
		super();
		this.source=new Source();
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}

	private void after(){
		System.out.println("after proxy");
	}
	
	private void before(){
		System.out.println("before proxy");
	}
}

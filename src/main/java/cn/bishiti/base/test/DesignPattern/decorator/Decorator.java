package cn.bishiti.base.test.DesignPattern.decorator;

public class Decorator implements Sourceable {

	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable){
		this.sourceable=sourceable;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before ……");
		sourceable.method();
		System.out.println("after ……");
	}

}

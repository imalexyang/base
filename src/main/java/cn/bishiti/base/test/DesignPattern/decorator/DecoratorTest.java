package cn.bishiti.base.test.DesignPattern.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source=new Decorator(new Source());
		source.method();
	}

}

package cn.bishiti.base.test.AdvancedFeatures.innerClass;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		InnerClass ic=new InnerClass(){
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("inner class method do");
			}
		};
		
		ic.method();
	}

}

abstract class InnerClass{
	public abstract void method();
}
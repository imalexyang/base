package cn.bishiti.base.test.AdvancedFeatures.innerClass;

public class StaticInnerClass {

	static class InnerClass{
		void method(){
			System.out.println("inner class method");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass ic=new StaticInnerClass.InnerClass();
		ic.method();
	}

}

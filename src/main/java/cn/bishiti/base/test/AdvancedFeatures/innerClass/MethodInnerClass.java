package cn.bishiti.base.test.AdvancedFeatures.innerClass;

public class MethodInnerClass {

	public void method(){
		class InnerClass{
			public MethodInnerClass getParent(){
				System.out.println("inner class");
				return MethodInnerClass.this;
			}
		}
		
		new InnerClass().getParent();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInnerClass mic=new MethodInnerClass();
		mic.method();
	}

}

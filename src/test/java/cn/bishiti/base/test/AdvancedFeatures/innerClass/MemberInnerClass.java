package cn.bishiti.base.test.AdvancedFeatures.innerClass;

public class MemberInnerClass {
	
	private class InnerClass{
		MemberInnerClass gerParent(){
			System.out.println("innner calss");
			return MemberInnerClass.this;
		}
	}
	
	public static void main(String args[]){
		MemberInnerClass mic=new MemberInnerClass();
		InnerClass ic=mic.new InnerClass();		
		System.out.println(ic.gerParent());
	}	
}
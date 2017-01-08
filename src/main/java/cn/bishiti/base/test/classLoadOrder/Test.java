package cn.bishiti.base.test.classLoadOrder;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {	
		
		FatherTest ft=new FatherTest();
		System.out.println();
		FatherTest ft2=new FatherTest();
		System.out.println();
		SonTest st=new SonTest();
		System.out.println();
		SonTest st2=new SonTest();
	}
}

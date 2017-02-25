package cn.bishiti.base.test.DesignPattern; 

public class Singleton2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub 

	}

	private static Singleton2 singleton=new Singleton2();
	
	private Singleton2(){};
	
	public static Singleton2 getInstance(){
		
		return singleton;
	}
}

  
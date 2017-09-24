package cn.bishiti.base.test.DesignPattern.singleton; 

public class Singleton1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub 

	}
	
	private static Singleton1 singleton;
	
	private Singleton1(){};
	
	public static synchronized Singleton1 getInstance(){
		if(singleton==null){
			singleton=new Singleton1();
		}
		return singleton;
	}
}

  
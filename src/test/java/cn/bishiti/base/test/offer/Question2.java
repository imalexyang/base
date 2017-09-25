package cn.bishiti.base.test.offer;


//singleton
public class Question2 {

	private Question2(){
		
	}
	
	private static final Question2 q2 = new Question2();
	
	//饿汉模式
	public static Question2 getInstance(){
		return q2;
	}
	
	private static volatile Question2 singleton;
	
	//双重锁校验
	public static Question2 getInstance2(){
		if(singleton == null){
			synchronized (Question2.class) {
				if(singleton == null){
					singleton = new Question2();
				}
			}
		}
		return singleton;
	}
	
}

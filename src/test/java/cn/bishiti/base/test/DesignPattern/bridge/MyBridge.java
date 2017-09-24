package cn.bishiti.base.test.DesignPattern.bridge;

public class MyBridge extends Bridge{

	public void method(){
		getSource().method();
	}
	
}

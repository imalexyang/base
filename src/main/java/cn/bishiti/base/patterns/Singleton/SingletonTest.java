package cn.bishiti.base.patterns.Singleton;

import java.util.Vector;

/**
 * 
* @ClassName: SingletonTest 
* @Description: 单例模式
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年12月30日 下午7:02:15 
*
 */
public class SingletonTest{
	
	private static SingletonTest instance=null;
	
	@SuppressWarnings("rawtypes")
	private Vector properties=null;
	
	@SuppressWarnings("rawtypes")
	public Vector getProperties(){
		return properties;
	}
	
	private SingletonTest(){
		
	}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance=new SingletonTest();
		}
	}
	
	public static SingletonTest getInstance(){
		if(instance==null){
			syncInit();
		}
		return instance;
	}
	
	public void updateProperties(){
		SingletonTest shadow=new SingletonTest();
		properties=shadow.getProperties();
	}
}

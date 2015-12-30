package cn.bishiti.base.patterns.Singleton;

/**
 * 
* @ClassName: Singleton 
* @Description: 单例模式 
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年12月30日 下午7:02:00 
*
 */
public class Singleton {
	private static Singleton instance=null;
		
	private Singleton(){
		
	}
	
	
	@SuppressWarnings("unused")
	private static class SingletonFactory{
		private static Singleton instance=new Singleton();
	}
	
	public static Singleton getInstance(){
		synchronized (instance) {
			if(instance==null){
				instance=new Singleton();
			}
		}		
		return instance;
	}
	
	public Object readResolve(){
		return instance;
	}
}

package cn.bishiti.base.patterns.FactoryMethod;

/**
 * 
* @ClassName: FactoryTest 
* @Description: 多个工厂方法模式
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年12月30日 下午4:48:22 
*
 */
public class FactoryTest3 {
	
	public static void main(String args[]){
		Sender s1=SendFactory.produceStaticMail();
		s1.send();
		Sender s2=SendFactory.produceStaticSms();
		s2.send();
	}
	
}

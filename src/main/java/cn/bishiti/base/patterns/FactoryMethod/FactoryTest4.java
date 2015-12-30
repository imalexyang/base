package cn.bishiti.base.patterns.FactoryMethod;

/**
 * 
* @ClassName: FactoryTest 
* @Description: 抽象工厂模式
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年12月30日 下午4:48:22 
*
 */
public class FactoryTest4 {
	
	public static void main(String args[]){
		Provider p=new SendMailFactory();
		Sender s=p.produce();
		s.send();
		
		Provider p2=new SendSmsFactory();
		Sender s2=p2.produce();
		s2.send();
	}
	
}

package cn.bishiti.base.patterns.FactoryMethod;

/**
 * 
* @ClassName: FactoryTest 
* @Description: 普通工厂模式 
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2015年12月30日 下午4:48:22 
*
 */
public class FactoryTest {
	
	public static void main(String args[]){
		SendFactory sf=new SendFactory();
		Sender s1=sf.produce("mail");
		s1.send();
		Sender s2=sf.produce("sms");
		s2.send(); 
		Sender s3=sf.produce("abc");
		s3.send(); //空指针
	}
	
}

package cn.bishiti.base.test.DesignPattern.factoryMethod;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory sf=new SendFactory();
		Sender sd=sf.produce("sms");
		sd.send();
		
		Sender sd2=SendFactory2.produceMail();
		sd2.send();
	}

}

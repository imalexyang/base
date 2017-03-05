package cn.bishiti.base.test.DesignPattern.abstractFactory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider p=new SendMailFactory();
		Sender s=p.produce();
		s.send();
	}

}

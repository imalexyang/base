package cn.bishiti.base.test.DesignPattern.factoryMethod;

public class SmsSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("sms send.");
	}

}

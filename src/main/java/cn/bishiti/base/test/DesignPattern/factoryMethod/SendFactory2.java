package cn.bishiti.base.test.DesignPattern.factoryMethod;

public class SendFactory2 {
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSMS(){
		return new SmsSender();
	}
}

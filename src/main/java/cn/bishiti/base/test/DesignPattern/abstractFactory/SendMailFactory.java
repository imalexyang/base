package cn.bishiti.base.test.DesignPattern.abstractFactory;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}

package cn.bishiti.base.test.DesignPattern.abstractFactory;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}

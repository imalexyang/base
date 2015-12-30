package cn.bishiti.base.patterns.FactoryMethod;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		System.out.println("请输入 mail 或 sms。");
		return null;
	}
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
	public static Sender produceStaticMail(){		
		return new MailSender();
	}
	
	public static Sender produceStaticSms(){
		return new SmsSender();
	}
}

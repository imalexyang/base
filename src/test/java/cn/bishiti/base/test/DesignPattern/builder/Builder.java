package cn.bishiti.base.test.DesignPattern.builder;

import java.util.ArrayList;
import java.util.List;

import cn.bishiti.base.test.DesignPattern.factoryMethod.MailSender;
import cn.bishiti.base.test.DesignPattern.factoryMethod.Sender;
import cn.bishiti.base.test.DesignPattern.factoryMethod.SmsSender;

public class Builder {

	private List<Sender> list=new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
	}
}

package cn.bishiti.base.patterns.Builder;

import java.util.ArrayList;
import java.util.List;

import cn.bishiti.base.patterns.FactoryMethod.MailSender;
import cn.bishiti.base.patterns.FactoryMethod.Sender;
import cn.bishiti.base.patterns.FactoryMethod.SmsSender;

/**
 * 
* @ClassName: Builder 
* @Description:  建造者模式
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2016年1月2日 下午6:03:29 
*
 */
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
	
	public int size(){
		return list.size();
	}
}

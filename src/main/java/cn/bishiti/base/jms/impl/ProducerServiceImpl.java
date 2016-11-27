package cn.bishiti.base.jms.impl;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import cn.bishiti.base.jms.ProducerService;

@Service
public class ProducerServiceImpl implements ProducerService{

	private JmsTemplate jmsTemplate;  
	
	@Override
	public void sendMessage(Destination destination, final String message) {
        System.out.println("----生产者发了一个消息：" + message);  
        System.out.println();
        jmsTemplate.send(destination, new MessageCreator() {  
            public Message createMessage(Session session) throws JMSException {  
                return session.createTextMessage(message);  
            }  
        });  		
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	@Resource
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}

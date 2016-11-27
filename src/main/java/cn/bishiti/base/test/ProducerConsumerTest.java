package cn.bishiti.base.test;
 
import java.util.Date;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bishiti.base.jms.ProducerService;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-jms.xml")
public class ProducerConsumerTest {
 
    @Autowired
    private ProducerService producerService;
    @Autowired
    @Qualifier("queueDestination")
    private Destination destination;
    
    @Test
    public void testSend() {    
    	for(int i=0;i<3;i++){
    		 producerService.sendMessage(destination, "current time:" + new Date());  
    	}             
    }
    
}

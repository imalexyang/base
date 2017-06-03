package cn.bishiti.base.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import cn.bishiti.base.service.TUserService;

@RunWith(Junit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml"})
public class Test {
	
	@Autowired
	private TUserService tUserService;
	
	private Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) throws InterruptedException {		
		Throwable ex = new Throwable();
        StackTraceElement[] stackElements = ex.getStackTrace();
        if (stackElements != null) {
            for (int i = 0; i < stackElements.length; i++) {
                System.out.print(stackElements[i].getClassName()+"/ ");
                System.out.print(stackElements[i].getFileName()+"/ ");
                System.out.print(stackElements[i].getLineNumber()+"/ ");
                System.out.println(stackElements[i].getMethodName());
                System.out.println("-----------------------------------");
            }
        }
        
        Exception e = new Exception("this is a log");
        e.printStackTrace();
	}
	
	@org.junit.Test
	public void TestApp(){
		logger.info("just log4j:"+tUserService);
		System.out.println("println:"+tUserService);
	}
}

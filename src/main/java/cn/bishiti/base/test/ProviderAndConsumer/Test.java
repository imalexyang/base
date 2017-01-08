package cn.bishiti.base.test.ProviderAndConsumer;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list=new ArrayList<Integer>();
		Provider p=new Provider(list);
		Consumer c=new Consumer(list);
		
		new Thread(c).start();
		Thread.sleep(2000);
		new Thread(p).start();
	}
}

package cn.bishiti.base.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		List<Integer> list=new ArrayList<Integer>();
		Provider p=new Provider(list);
		Consumer c=new Consumer(list);
		
		new Thread(c).start();
		Thread.sleep(2000);
		new Thread(p).start();
		
		FatherTest ft=new FatherTest();
		System.out.println();
		FatherTest ft2=new FatherTest();
		System.out.println();
		SonTest st=new SonTest();
		System.out.println();
		SonTest st2=new SonTest();
	}
}

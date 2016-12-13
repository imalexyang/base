package cn.bishiti.base.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Provider p=new Provider(list);
		Consumer c=new Consumer(list);
		
		new Thread(c).start();
		new Thread(p).start();
	}
}

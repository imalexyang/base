package cn.bishiti.base.test.lambda; 

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		String  runString = "run outside!";
		new Thread(()->System.out.println("java8 " + runString)).start();
		
		new Thread(new Runnable() {
		    String  runString = "run inside!";
		    @Override
		    public void run(){
		         System.out.println("java7 " +this.runString);
		    }
		}).start();

		System.out.println();
		
		List<String> features = Arrays.asList("lambda","default method","stream api","date and time api");
		features.forEach(n -> System.out.println(n));
		System.out.println();
		features.forEach(System.out::println);  
	}
}

  
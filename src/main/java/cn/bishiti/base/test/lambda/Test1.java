package cn.bishiti.base.test.lambda; 

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
	}

}

  
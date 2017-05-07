package cn.bishiti.base.test.DesignPattern.facade;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		computer.startup();
		System.out.println();
		computer.shutdown();
	}

}

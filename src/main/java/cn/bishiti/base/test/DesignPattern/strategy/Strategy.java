package cn.bishiti.base.test.DesignPattern.strategy;

public class Strategy {

	public static void main(String[] args){
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
	
}

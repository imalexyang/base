/*package cn.bishiti.base.test.lambda;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(() -> System.out.println("method1"));
		
		method2((i) -> System.out.println("method2 parameter:"+i));
		
		int k =method3((i,j) -> i + j);
		System.out.println("method 3 result:"+k);
	}

	private static void method1(Lambda1 lambda) {
		// TODO Auto-generated method stub
		lambda.method();
	}

	private static void method2(Lambda2 lambda){
		lambda.method(1);
	}
	
	private static int method3(Lambda3 lambda){
		return lambda.method(5, 6);
	}
}

interface Lambda1{
	void method();
}

interface Lambda2{
	void method(int i);
}

interface Lambda3{
	int method(int i,int j);
}
*/
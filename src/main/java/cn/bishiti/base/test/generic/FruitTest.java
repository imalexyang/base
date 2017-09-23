package cn.bishiti.base.test.generic;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitGenerator fruit = new FruitGenerator();
		
		System.out.println(fruit.next());
		System.out.println(fruit.next());
		System.out.println(fruit.next());
		System.out.println(fruit.next());
		
		out("findingsea");
        out(123);
        out(11.11);
        out(true);
	}

	public static <T> void out(T t){
		System.out.println(t);
	}
	//https://segmentfault.com/a/1190000002646193
}

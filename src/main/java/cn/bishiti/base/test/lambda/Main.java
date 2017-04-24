package cn.bishiti.base.test.lambda;

//http://www.open-open.com/lib/view/open1397471445653.html
public class Main {
	public static void main(String[] args) {
		startTest(new Lambda() {
			@Override
			public void doSomething() {
				System.out.println("通过匿名类方式实现");
			}
		});

		startTest(new ParamLambda() {
			@Override
			public void doSomething(String param1) {
				System.out.println("通过匿名类方式实现,参数的值是:" + param1);
			}
		});

		startTest(() -> {
			System.out.println("使用lambda表达式:无参数");
		});

		startTest((param1) -> {
			System.out.println("使用lambda表达式:一个参数,其值是:" + param1);
		});

		startTest((param1, param2) -> {
			System.out.println("使用lambda表达式:一个参数,其值是:" + param1 + "," + param2);
		});
	}

	public static void startTest(Lambda obj) {
		obj.doSomething();
	}

	public static void startTest(ParamLambda obj) {
		obj.doSomething("to do something");
	}

	public static void startTest(MultiParamLambda obj) {
		obj.doSomething("hi", "you must do something");
	}
}

interface Lambda {
	void doSomething();
}

interface ParamLambda {
	void doSomething(String param1);
}

interface MultiParamLambda {
	void doSomething(String param1, String param2);
}
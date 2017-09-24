package cn.bishiti.base.test.generic;

public class ContainerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Container<Integer,String> con1 = new Container<Integer, String>(1, "one");
		Container<String,Integer> con2 = new Container<String,Integer>("age",24);
		Container<Double,Double> con3 = new Container<Double, Double>(2.0,3.0);
		
		System.out.println(con1.getKey() + ":" +con1.getValue());
		System.out.println(con2.getKey() + ":" +con2.getValue());
		System.out.println(con3.getKey() + ":" +con3.getValue());
	}

}

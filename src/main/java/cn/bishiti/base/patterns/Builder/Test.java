package cn.bishiti.base.patterns.Builder;

/**
 * 
* @ClassName: Test 
* @Description: 建造者模式
* @author yangyw(yawen.yang@4wtrip.com)
* @date 2016年1月2日 下午6:03:14 
*
 */
public class Test {
	public static void main(String args[]){
		Builder builder=new Builder();
		builder.produceMailSender(10);
		System.out.println(builder.size());
	}
}

package cn.bishiti.base.test.offer;

public class Question4 {

	public static void main(String[] args) {		
		String str = "We are happy.";		
		if(str.indexOf(" ")<0){
			System.out.println("没有空格,后边的可以跳过.");
		}
		String[] arraySource = str.split("");
		StringBuffer sb = new StringBuffer();
		for(String s:arraySource){
			if(s.equals(" ")){
				sb.append("%20");
			}else{
				sb.append(s);
			}			
		}
		System.out.println(sb);
	}

}

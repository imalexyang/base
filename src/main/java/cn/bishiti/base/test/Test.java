package cn.bishiti.base.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get());
	}
	
	public static int get(){
		int i=9;
		try{
			return i;
		}catch(Exception e){
			
		}finally{
			i=i+1;
			System.out.println(i);
		}
		return i;
	}
}

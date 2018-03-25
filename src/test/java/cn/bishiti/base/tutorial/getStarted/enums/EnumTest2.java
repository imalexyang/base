package cn.bishiti.base.tutorial.getStarted.enums;

public class EnumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color.BLACK.getColor();
		Color.BLACK.getIndex();
		
		for(Color color:Color.values()){
			System.out.println(color.getColor()+":"+color.getIndex());
		}
	}

}

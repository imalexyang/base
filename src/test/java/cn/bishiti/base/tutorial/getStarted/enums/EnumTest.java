package cn.bishiti.base.tutorial.getStarted.enums;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0x11);
		showColor(Color.BLACK);
	}

	static void showColor(Color color){
		switch(color){
		case BLACK:
			System.out.println(Color.BLACK);
			break;
		case RED:
			System.out.println(Color.RED);
			break;
		default :
			System.out.println(Color.RED);
			break;
		}
	}
	
}

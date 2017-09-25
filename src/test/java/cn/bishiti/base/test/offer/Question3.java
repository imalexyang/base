package cn.bishiti.base.test.offer;

//
public class Question3 {
	
	public static void main(String args[]){
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(find(array,-1));
		System.out.println("*******");
		System.out.println(find(array,7));
		System.out.println("*******");
		System.out.println(find(array,20));
	}
	
	public static boolean find(int[][] array,int number){
		boolean flag =false;
		int y = array.length;
		int x = array[0].length;
		int indexy = 0;
		int indexx = x-1;
		for(int i=0;;i++){
			System.out.println("count:" + i);
			if(indexx < 0 ||indexy > y-1){
				break;
			}
			if(array[indexy][indexx] == number){
				flag = true;
				break;
			}
			if(array[indexy][indexx] < number){
				indexy += 1;
				continue;
			}
			if(array[indexy][indexx] > number){
				indexx -= 1;
				continue;
			}
		}
		return flag; 
	}
	
}

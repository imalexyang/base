package cn.bishiti.base.test.sort; 

public class SortUtil {

	public static void main(String[] args) {

		// TODO Auto-generated method stub 
		int[] array={4,5,3,7,8,1,9,2,6};
		bubbleSort(array);
	}
	
	public static void bubbleSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
	
	public static void selectionSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			int min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min=j;
				}
			}
			int temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
	
	public static void insertionSort(int[] array){
		for(int i=1;i<array.length;i++){
			int temp=array[i];
			int index=i;
			for(int j=i-1;j>=0;j--){
				if(array[j]>temp){
					array[j+1]=array[j];
					index=j;
				}
			}
			array[index]=temp;
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}

  
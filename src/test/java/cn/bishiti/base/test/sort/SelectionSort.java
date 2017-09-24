package cn.bishiti.base.test.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={4,5,3,7,8,1,9,2,6};
		selectionSort(array);
	}

	public static void selectionSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			int min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[min]>array[j]){
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
}

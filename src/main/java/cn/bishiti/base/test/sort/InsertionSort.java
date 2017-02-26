package cn.bishiti.base.test.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={4,5,3,7,8,1,9,2,6};
		insertionSort(array);
	}

	public static void insertionSort(int[] array){
		for(int i=1;i<array.length;i++){
			int index=i;
			int temp=array[i];
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

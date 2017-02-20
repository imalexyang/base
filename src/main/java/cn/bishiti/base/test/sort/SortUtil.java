package cn.bishiti.base.test.sort; 

public class SortUtil {

	public static void main(String[] args) {

		// TODO Auto-generated method stub 

	}
	
	public static int[] bubbleSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

	
	public static int[] selectionSort(int[] array){
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
		return array;
	}
	
	public static int[] insertionSort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=1;j>0&&array[j]<array[j-1];j--){
				int temp=array[i];
				array[j]=array[j-1];
				array[j-1]=temp;
			}
		}
		return array;
	}
}

  
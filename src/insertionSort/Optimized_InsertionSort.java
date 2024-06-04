package insertionSort;

import java.util.Arrays;

public class Optimized_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {23,67,90,45,3};
		System.out.println("orginal array:" + Arrays.toString(array));
		insertionSort(array);
		System.out.println("Sorted array:" +Arrays.toString(array));

	}
	static void insertionSort(int[] array) {
		int n = array.length;
		for(int i=1; i<n; ++i) {
			int key = array[i];
			int j=i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1] =key;
		}
	}

}

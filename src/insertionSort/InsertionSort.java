package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[5];
		
		array[0] = 90;
		array[1] = 10;
		array[2] = 45;
		array[3] = 87;
		array[4] = 23;
		
		int i,key,j;
		
		int n =5;
		
		for(i=1; i<n; i++) {
			key =array[i];
			j=i-1;
			
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1] = key;
		}
		for(int x=0; x<5; x++) {
			System.out.println(array[x]);
		}
		
		

	}

}

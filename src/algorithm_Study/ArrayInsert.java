package algorithm_Study;

import java.util.Arrays;

public class ArrayInsert {

	public static int[] insert(int [] arr, int index, int value) {
		
		int [] temp = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
		
		
		for(int i=temp.length-1; i>index; i--) {
			temp[i] = temp[i-1];
		}
		temp[index]= value;
		return temp;
		
		
		
	}
	
	
	public static void main(String[] args) {


		int [] array = {0,1,2,3,4,5,6,7,8,9};
		
		array = insert(array,2,12);
		
		System.out.println(Arrays.toString(array));
	}

}

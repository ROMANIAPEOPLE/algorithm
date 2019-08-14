package algorithm_Study;

import java.util.Arrays;

public class ArrayRemove {

	
	public static int [] remove (int [] a, int index) {
		for(int i=index; i<a.length-1; i++) {
			a[i] = a[i+1];
		}
		
		int [] temp = new int[a.length-1];
		
		for(int i=0; i<a.length-1; i++) {
			temp[i] = a[i];
		}
		return temp;
		
		
	}
	
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		arr= remove(arr,4);
		
		System.out.println(Arrays.toString(arr));
		
	}

}

package TSET;

import java.util.Arrays;

public class SelectionSort {

	static void swap(int [] a , int i, int j) {
		
		int temp= a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	
	
	static int findMin(int [] a, int start) {
		int minValue = a[start];
		int minIndex = start;
		
		for(int i=start+1; i<a.length; i++) {
			if(a[i] < minValue) {
				minValue = a[i];
				minIndex =i;
			}
		}
		return minIndex;

		
	}
	
	static void selectionSort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			int min = findMin(a,i);
			swap(a, i, min);
			
			
		}
	}
	
	
	
	public static void main(String[] args) {

		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
		selectionSort(a);
		System.out.println(Arrays.toString(a));

	}

}

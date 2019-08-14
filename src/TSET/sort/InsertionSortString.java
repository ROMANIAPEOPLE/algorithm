package TSET.sort;

import java.util.Arrays;

public class InsertionSortString {

	static void insertionSort(String [] a) {

		for(int i=1; i<a.length; i++) {
			String value = a[i]; //저장할 값
			int j;
			for(j = i -1; j>=0; j--) {
				if(a[j].compareTo(value) > 0) {
					a[j+1] = a[j];
				}
				else {
					break;
				}
			}
		
		
			a[j+1] = value;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}

}

package TSET;

import java.util.Arrays;

public class insertionSort {

	static void insertionSort(int [] a ) {
	
		for(int i=1; i<a.length; i++) {
			int value = a[i]; //삽입할 값 저장
			int j;
			for(j=i-1; j>=0; j--) {
				if(a[j] > value) {
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
		int[] a = { 17, 14, 11, 19, 13, 15 };
		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}

}

package TSET;

import java.util.Arrays;

public class BubbleSort {

	
	static void swap(int [] a , int i , int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
	static void bubbleSort(int [] a) {
		for(int i=a.length-1; i>0; i--) {
			for(int j=0; j<i; j++ ) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	
//	static void buubleSort(int [] a) {
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length-1-i; j++) {
//				if(a[j] > a[j+1]) {
//					swap(a,j,j+1);
//				}
//			}
//		}
//	}
	
	
	
	public static void main(String[] args) {

		int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}

}

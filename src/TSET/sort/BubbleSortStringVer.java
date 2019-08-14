package TSET.sort;

import java.util.Arrays;


public class BubbleSortStringVer {

	static void swap(String [] a , int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(String [] a) {
		
		for(int i=0; i<a.length; i++) {
			for( int j=0; j<a.length-1-i; j++) {
				if(a[j].compareTo(a[j+1]) > 0) {
					swap(a,j,j+1);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
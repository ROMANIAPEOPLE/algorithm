package TSET.sort;

import java.util.Arrays;

public class SelectionSortStringVer {
	static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	static int findMin(String [] a , int start) {
		String min = a[start];
		int minIndex = start;

		for(int i=start+1; i<a.length; i++) {
			if(a[i].compareTo(min) < 0) {
				min = a[i];
				minIndex =i;
			}
		
			
			
			
		}
		return minIndex;
		
		
	}
	
	static void selectionSort(String[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
			swap(a, i, minIndex);
		}
	}

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}

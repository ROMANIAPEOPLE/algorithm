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
			int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
			swap(a, i, minIndex);
		}
	}

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}

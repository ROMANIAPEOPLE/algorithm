/* 배열의 원소 중 가장 작은 원소를 선택하여 첫번째 원소와 교환
 * 두번째로 작은 원소를 찾아 두번째 원소와 교환
 *  ---- 반복
 */


package TSET.sort;

import java.util.Arrays;

public class SelectionSort {

	static void swap(int [] a , int i, int j) {


		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		
		
	}
	
	static int findMin(int [] a , int start) {

		int min = a[start];
		int index =start;
		
		for(int i=start+1; i<a.length; i++) {
			if(min>a[i]) {
				min = a[i];
				index = i;
			}
		}
		return index;
	
	}
	
	
	static void selectionSort(int [] a) {
		
		for(int i=0; i<a.length-1; i++) {
			int minIndex= findMin(a,i);
			swap(a,i,minIndex);
		}
	}
	
	
	
	public static void main(String[] args) {

		int [] a = {17,14,11,19,13,15,18,12,16,20};
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}

}

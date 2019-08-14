package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2750 {

	
	static void insertionSort(int [] a) {
		
		for(int i=1; i<a.length; i++) {
			int  value = a[i];
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

		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		int [] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}

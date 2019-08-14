package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2751 {
	
	static void merge(int [] a, int start, int end) {
		if(start == end) return;
		
		int middle = (start+end)/2;
		merge(a,start,middle);
		merge(a,middle+1,end);
		mergeSort(a,start,middle,end);
	}
	
	static void mergeSort(int [] a, int start, int middle, int end) {
		int length = end-start+1;
		int [] temp = new int[length];

		int index1 =start;
		int index2= middle+1;
		int i=0;
		
		
		while(index1 <=middle && index2 <=end) {
			if(a[index1] < a[index2] ) {
				temp[i++] = a[index1++];
			}
			else {
				temp[i++] = a[index2++];
			}
		}
		
		while(index1 <= middle) {
			temp[i++] = a[index1++];
		}
		
		while(index2 <=end) {
			temp[i++] = a[index2++];
		}
		
		for(i=0; i<temp.length; i++) {
			a[start+i] = temp[i];
			
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int [] a = new int[num1];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
	

		merge(a,0,a.length-1);

		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}

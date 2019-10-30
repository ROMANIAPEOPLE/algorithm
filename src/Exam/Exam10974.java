package Exam;

import java.util.Scanner;

public class Exam10974 {

	static boolean next_num(int [] a) {
		int i=a.length-1;
		while(i>0 && a[i-1] >= a[i]) {
			i--;
		}
		
		if(i<=0) {
			return false;
		}
		
		int j=a.length-1;
		while(a[i-1] >= a[j]) {
			j--;
		}
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		

		j=a.length-1;
		
		while(i<j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		while(next_num(a)) {
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		
	}
}

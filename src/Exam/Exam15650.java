package Exam;

import java.util.Scanner;


public class Exam15650 {
	static int [] a = new int[10];
	static boolean [] c = new boolean[10];
	
	static void go(int index, int start, int n, int m) {

		if(index == m) {
			for(int i=0; i<a.length; i++) {
				if(a[i] !=0 ) {
					System.out.print(a[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<=n; i++) {
			if(c[i]) continue;
			c[i]= true;
			a[index] = i;
			go(index+1,i+1,n,m);
			c[i] = false;
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		go(0,1,N,M);

		
		
	}

}

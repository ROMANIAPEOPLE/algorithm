package Exam;

import java.util.Scanner;

public class Exam10971 {
	static boolean next_num(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i--;
		}

		if (i <= 0)
			return false;

		int j = a.length - 1;
		while (a[i - 1] >= a[j]) {
			j--;
		}

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;

		j = a.length - 1;

		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int [] d = new int[n];
		int a [][] = new int[n][n];
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			d[i] = i;
		}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		do {
			boolean check = true;
			int sum=0;
			for(int i=0; i<n-1; i++) {
				if(a[d[i]][d[i+1]] ==0) {
					check =false;
				}
				else {
					sum+=a[d[i]][d[i+1]];
				}
			}
			if(check && a[d[n-1]][d[0]] !=0) {
				sum+=a[d[n-1]][d[0]];
				if(ans > sum) {
					ans=sum;
				}
			}
			
		}while(next_num(d));

		System.out.println(ans);
		
	}

}

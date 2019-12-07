package algorithm_Study;

import java.util.Scanner;

public class 외판원순회_순열 {
	static boolean next(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i--;
		}

		if (i < 0)
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
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] d = new int[N];
		int [][] a = new int[N][N];
		
		for(int i=0; i<d.length; i++) {
			d[i] = i;
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int ans = Integer.MAX_VALUE;
		
		do {
			
			int sum =0;
			boolean ck=true;
			for(int i=0; i<N-1; i++) {
				if(a[d[i]][d[i+1]] ==0) {
					ck=false;
				}
				else {
					sum+=a[d[i]][d[i+1]];
				}
			}
			
			if(ck && a[d[N-1]][d[0]] !=0) {
				sum+=a[d[N-1]][d[0]];
				if(ans>sum) {
					ans=sum;
				}
			}
			
			
			
		}while(next(d));
		
		
		System.out.println(ans);
		
		
	}

}

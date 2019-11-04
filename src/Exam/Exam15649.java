package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam15649 {

	static int [] a = new int[10];
	static boolean [] c = new boolean[10];
	
	static void go(int index, int n, int m) {
		if(m==index) {
			for(int i=0; i<a.length; i++) {
				if(a[i]!=0) {
					System.out.print(a[i]+ " ");
				}
				
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=n; i++) {
//			if(c[i]) continue;
//			c[i] = true; 
			a[index] = i;
			go(index+1,n,m);
//			c[i] = false;
		}
	}
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		go(0,N,M);
		
		
		
	}

}

package Exam;

import java.util.Scanner;

public class Exam9095_2 {

	static int go(int sum, int goal) {
		if(sum>goal) {
			return 0;
		}
		if(sum==goal) {
			return 1;
		}
		
		int now=0;
		for(int i=1; i<=3; i++) {
			now+=go(sum+i,goal);
		}
		
	
		return now;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0; i<T; i++) {
			
			int n=sc.nextInt();
			System.out.println(go(0,n));
		}
	}
	
}

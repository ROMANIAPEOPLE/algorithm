package Exam;

import java.util.Scanner;

public class Exam14501 {

	static int ans = Integer.MIN_VALUE;
	
	static void go(int day, int sum, int goal ,int [] T, int [] P) {
		if(day == goal) {
			if(ans < sum) {
				ans = sum;
				return;
			}
		}
		
		if(day > goal) {
			return;
		}
		
		go(day+1,sum,goal,T,P);
		go(day+T[day], sum+P[day],goal,T,P);
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		
		int [] T = new int[N+1];  //소요되는 기간
		int [] P = new int[N+1]; //페이
		
		for(int i=1; i<=N; i++) {
			T[i]=sc.nextInt();
			P[i]=sc.nextInt();
		}

		go(1,0,N+1,T,P);
		System.out.println(ans);
		
		
		
	}
}

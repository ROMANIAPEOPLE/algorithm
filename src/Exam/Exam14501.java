package Exam;

import java.util.Scanner;

public class Exam14501 {

	static int [] T; //일 수
	static int [] P; // 페이
	static int ans=Integer.MIN_VALUE;
	static int n;
	
	static void go(int day, int sum) {
		if(day==n+1) {
			if(ans < sum) {
				ans=sum;
			}
			return;
		}
		if(day>n+1) {
			return;
		}
		go(day+1,sum);
		go(day+T[day],sum+P[day]);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		T=new int[n+1];
		P=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			T[i]= sc.nextInt();
			P[i]= sc.nextInt();
		}
		
		go(1,0);
		System.out.println(ans);
		
	}
	
}

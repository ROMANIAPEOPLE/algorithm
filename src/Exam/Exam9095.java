package Exam;

import java.util.Scanner;

public class Exam9095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		int[] dp = new int[11];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <11; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
	
		for(int i=0; i<testCase; i++) {
		System.out.println(dp[sc.nextInt()]);
		}
		
	}
}

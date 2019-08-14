package Exam;

import java.util.Scanner;

public class Exam13241 {

	public static long getGCD(long num1, long num2) {
		
		long low=1;
		
		for(int i=1; i<=num2; i++) {
			if(num1 % i ==0 && num2 %i ==0) {
				low =i;
			}
		}
	
		return low;
		
		
	}
	
	
	public static void main(String[] args) {

		
		Scanner sc  = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		
		long gcd =getGCD(Math.max(num1, num2), Math.min(num1, num2));
		
		System.out.println(num1*num2/gcd);
		
	}
}

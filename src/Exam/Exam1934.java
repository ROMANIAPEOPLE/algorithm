package Exam;

import java.util.Scanner;

public class Exam1934 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result =0;
			int low = 1;
			
			for(int j=1; j<=Math.min(num1, num2); j++) {
				if(num1 % j == 0 && num2 % j ==0) {
					low =j;
				}
				result = num1*num2 / low;
			}
			
			System.out.println(result);
		}
	}
}

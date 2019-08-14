package Exam;

import java.util.Scanner;

public class Exam2436 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int max=1;
		int small = Math.min(num1, num2);
		
		for(int i=1; i<=small; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
					max = i;
			}
		}
		
		System.out.println(max);
		System.out.println(num1*num2 /  max);
	}

}

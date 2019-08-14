package Exam;

import java.util.Scanner;

public class Exam2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int low = Math.min(num1, num2);
		int min=0;
		for(int i=1; i<=low; i++) {
			if(num1 % i ==0 && num2 % i ==0) {
				 min=i;
			}
		
		}
		
		System.out.println(min);
		System.out.println(num1*num2/min);
		
	}

}

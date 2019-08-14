package Exam;

import java.util.Scanner;

public class Exam2908 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		
		int a = num1/100;
		int b = (num1/10) %10;
		int c = num1%10;
		
		int result1 = (c*100)+(b*10) + a;
		
		
		int num2 =sc.nextInt();
		
		int d = num2/100;
		int e = (num2/10) %10;
		int f = num2%10;
		
		int result2 = (f*100) + (e*10) + d;
		
		
		if(result1  > result2) {
			System.out.println(result1);
		}
		else {
			System.out.println(result2);
		}
			
		
		
	}

}

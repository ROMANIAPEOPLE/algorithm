package Exam;

import java.util.Scanner;

public class Exam1065 {

	public static void main(String[] args) {

		
		Scanner sc  = new Scanner(System.in);
		
		int num =sc.nextInt();
		
		int result =0;
		
		if(num<100) {
			System.out.println(num);
			return;
		}
		
		result =99;
		
		
		for(int i=100; i<=num; i++) {
			 int a = i/100;
			 int b = (i / 10) % 10;
			 int c = i%10;
			 
			 if((b-a) == (c-b)) {
				 result++;
			 }
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}

package Exam;

import java.util.Scanner;

public class Exam1929 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count =0;
		
		for(int i=num1; i<=num2; i++) {
			count =0;
			for(int j=1; j<=i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			
			if(count ==2) {
			
				System.out.println(i);
				
			}
			
		}
		
	}

}

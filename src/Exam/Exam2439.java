package Exam;

import java.util.Scanner;

public class Exam2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=num; i++) {
			for(int j=1; j<=num-1; j++) {
				System.out.print("");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}

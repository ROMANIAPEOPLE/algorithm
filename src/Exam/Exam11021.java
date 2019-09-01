package Exam;

import java.util.Scanner;

public class Exam11021 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		int testCase= sc.nextInt();
		for(int i=0; i<testCase; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum = a+b;
			System.out.println("Case #" + i + ": " + sum);

			
		}
	}

}

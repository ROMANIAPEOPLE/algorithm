package Exam;

import java.util.Scanner;

public class Exam1330 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");

		
	}
}

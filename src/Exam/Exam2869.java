package Exam;

import java.util.Scanner;

public class Exam2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long V = sc.nextInt();

		long result = (V - A) / (A - B);

		if ((V - A) % (A - B) == 0) {
			System.out.println(result + 1);
		} else {
			System.out.println(result + 2);
		}

	}
}

// ->시간초과

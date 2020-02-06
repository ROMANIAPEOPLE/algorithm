package Exam;

import java.util.Scanner;

public class Exam1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		int N = 0;
		for (int i = 1; i <= S; i++) {
			S -= i;
			N++;
		}

		System.out.println(N);
	}

}

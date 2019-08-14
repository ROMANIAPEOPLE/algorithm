package Exam;

import java.util.Scanner;

public class Exam1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;
		int score;
		for (int i = 0; i < n; i++) {
			score = sc.nextInt();
			sum += score;
			if (score > max) {
				max = score;
			}
		}

		double avg = 0;
		avg = 100.0 * sum / max / n;
		System.out.printf("%.2f", avg);

	}

}

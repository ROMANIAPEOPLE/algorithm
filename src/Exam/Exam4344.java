package Exam;

import java.util.Scanner;

public class Exam4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int students;
		int[] score = new int[1000];
		int sum = 0;
		int count = 0;
		double avg = 0;
		for (int i = 0; i < c; i++) {
			students = sc.nextInt();
			for (int j = 0; j < students; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = sum / students;

			for (int j = 0; j < students; j++) {
				if (score[j] > avg) {
					count++;
				}
			}

			System.out.printf("%.3f", 100.0 * count / students);
			System.out.println("%");

		}

	}

}

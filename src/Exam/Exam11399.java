package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] atm = new int[n];
		for (int i = 0; i < atm.length; i++) {
			atm[i] = sc.nextInt();
		}

		Arrays.parallelSort(atm);

		int temp = 0;
		int sum = 0;

		for (int i = 0; i < atm.length; i++) {
			temp += atm[i];
			sum += temp;
		}
		System.out.println(sum);

	}
}

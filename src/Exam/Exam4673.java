package Exam;

import java.util.Scanner;

public class Exam4673 {

	public static boolean[] check = new boolean[10001];

	public static void selfNum(int n) {
		int sum = n;
		while (n != 0) {

			int mod = n % 10;
			n /= 10;
			sum += mod;
		}

		if (sum <= 10000) {
			check[sum] = true;
		}

	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10000; i++) {
			selfNum(i);
		}

		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}

	}

}

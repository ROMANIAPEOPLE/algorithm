package Exam;

import java.util.Scanner;

public class Exam6588 {
	static boolean[] prime = new boolean[10001];

	public static void check_Prime() {
		for (int i = 2; i <= 10000; i++) {
			if (!prime[i]) {
				for (int j = i * 2; j <= 10000; j += i) {
					prime[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		check_Prime();
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			
			int temp= n/2;
			int diff = 0;

			while (true) {
				if (!prime[temp - diff] && !prime[temp + diff]) {
					System.out.print(n + "=" + (n - diff) + "+" + (n + diff));
					System.out.println();
				}
				diff++;
			}

		}

	}

}

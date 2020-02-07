package Exam;

import java.util.Scanner;

public class Exam11047 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] money = new int[N];

		for (int i = 0; i < money.length; i++) {
			money[i] = sc.nextInt();
		}

		for (int i = money.length - 1; i >= 0; i--) {
			count += K / money[i];

			if (K / money[i] != 0) {
				K = K % money[i];
			}

			if (K == 0) {
				break;
			}

		}

		System.out.println(count);
	}
}

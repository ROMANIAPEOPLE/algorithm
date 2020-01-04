package ¼öÇĞ1;

import java.util.Scanner;

public class ¹úÁı {

	public static void find(int n) {

		int count = 1;
		int plus = 6;
		int start = 1;

		while (true) {
			start += plus;
			plus += 6;
			count++;

			if (n <= start) {
				break;
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		find(n);

	}

}

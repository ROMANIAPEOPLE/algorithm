package 블로그문제복습;

import java.util.Scanner;

public class Exam2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = n;
		int result = 0;

		while (n != 0) {
			n--;

			int temp = n;
			int temp2 = n;

			while (temp2 != 0) {
				temp += temp2 % 10;
				temp2 /= 10;
			}

			if (temp == value) {
				result = n;
			}

		}

		System.out.println(result);

	}

}

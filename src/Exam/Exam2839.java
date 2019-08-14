package Exam;

import java.util.Scanner;

public class Exam2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int num2 = 0;
		while (true) {
			if (num % 5 == 0) {
				num2 += num / 5;
				break;
			} else {
				num -= 3;
				num2++;
			}

			if (num < 0) {
				break;
			}
		}

		if (num < 0) {
			System.out.println("-1");
		} else {
			System.out.println(num2);
		}
	}
}
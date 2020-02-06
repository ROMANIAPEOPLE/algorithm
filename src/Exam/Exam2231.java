package Exam;

import java.util.Scanner;

public class Exam2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int a = num;
		int res = 0;
		
		while (num != 0) {
			num--;

			int temp = num;
			int temp2 = num;
			while (temp != 0) {
				temp2 += temp % 10;
				temp /= 10;
			}
			if (temp2 == a) {
				res = num;
			}

		}

		System.out.println(res);

	}
}

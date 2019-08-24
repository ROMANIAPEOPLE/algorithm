package Exam;

import java.util.Scanner;

public class Exam1436_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int num = 0;

		while (true) {
			num++;
			String s = Integer.toString(num);

			if (s.contains("666")) {
				cnt++;
			}

			if (cnt == N) {
				break;
			}
		}

		System.out.println(num);

	}

}

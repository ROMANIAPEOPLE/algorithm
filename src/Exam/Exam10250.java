package Exam;

import java.util.Scanner;

public class Exam10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while (T-- > 0) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int x = (N / H) + 1;
			int y = N % H;

			if (N % H == 0) {
				x = N / H;
				y = H;
			}

			System.out.println(y * 100 + x);

		}

	}

}

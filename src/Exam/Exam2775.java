package Exam;

import java.util.Scanner;

public class Exam2775 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] a = new int[15][16];

		for (int i = 0; i < a.length; i++) {
			a[i][1] = i;
			a[0][i + 1] = i + 1;
		}

		for (int i = 1; i < a.length; i++) {
			a[i][1] = 1;
		}

		int t = sc.nextInt();
		for (int s = 0; s < t; s++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					a[i][j] = a[i][j - 1] + a[i - 1][j];
				}

			}

			System.out.println(a[k][n]);
		}

	}

}

package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] arr = new int[N][2];
		int[] res = new int[N];
		for (int i = 0; i < res.length; i++) {
			res[i] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt(); // ¸ö¹«°Ô
			arr[i][1] = sc.nextInt(); // Å°
		}

		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;

					res[i] = rank;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.printf("%d ", res[i]);
		}

	}

}

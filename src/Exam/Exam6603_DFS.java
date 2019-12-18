package Exam;

import java.util.Scanner;

public class Exam6603_DFS {

	static int n;
	static int[] arr;

	public static void backTrack(int index, int count, String ans) {

		if (index == n) {
			if (count == 6) {
				System.out.println(ans);
			}
		} else {

			backTrack(index + 1, count + 1, ans + arr[index] + " ");
			backTrack(index + 1, count, ans);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			n = sc.nextInt();
			arr = new int[n];

			if (n == 0)
				break;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			backTrack(0, 0, "");
			System.out.println();
		}
	}
}
package Exam;

import java.util.Scanner;

public class Exam15652 {

	static int n, m;

	public static void backTrack(int index, int cur, String str) {
		if (index == m) {
			System.out.println(str);
		} else {
			for (int i = cur; i <= n; i++) {
				backTrack(index + 1, i, str + i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		backTrack(0, 1, "");

	}

}

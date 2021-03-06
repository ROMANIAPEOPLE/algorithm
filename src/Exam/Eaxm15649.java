package Exam;

import java.util.Scanner;

public class Eaxm15649 {

	static int n, m;
	static boolean[] visit = new boolean[9];

	public static void backTrack(int index, String str) {

		if (index == m) {
			System.out.println(str);
			return;
		}

		else {
			for (int i = 1; i <= n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					backTrack(index + 1, str + i + " ");
					visit[i] = false;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		backTrack(0, "");

	}
}
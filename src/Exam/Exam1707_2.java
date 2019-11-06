package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1707_2 {

	public static void dfs(ArrayList<Integer>[] a, int[] color, int x, int c) {

		color[x] = c; // Ž�� �Ϸ�
		for (int y : a[x]) {
			if (color[y] == 0) {
				dfs(a, color, y, 3 - c);
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
			for (int i = 1; i <= n; i++) {
				a[i] = new ArrayList();
			}

			int[] color = new int[n + 1];

			for (int i = 0; i < m; i++) {
				int team1 = sc.nextInt();
				int team2 = sc.nextInt();

				a[team1].add(team2);
				a[team2].add(team1);
			}

			boolean ok = true;

			for (int i = 1; i <= n; i++) {
				if (color[i] == 0) {
					dfs(a, color, i, 1);
				}
			}

			for (int i = 1; i <= n; i++) {
				for (int j : a[i]) {
					if (color[i] == color[j]) {
						ok = false;
					}
				}
			}
			if (ok) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}

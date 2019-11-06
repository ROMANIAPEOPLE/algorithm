package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1707 {

	public static void dfs(ArrayList<Integer>[] a, int[] color, int x, int c) {
		color[x] = c;
		for (int y : a[x]) {
			if (color[y] == 0) {
				dfs(a, color, y, 3 - c);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // testCase
		while (t-- > 0) {
			int n = sc.nextInt(); // 정점의 수
			int m = sc.nextInt(); // 간선의 수

			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];

			for (int i = 1; i <= n; i++) { // 정점만큼 배열 어레이리스트 생성
				a[i] = new ArrayList<Integer>();
			}

			for (int i = 0; i < m; i++) {
				int part1 = sc.nextInt();
				int part2 = sc.nextInt();

				a[part1].add(part2);
				a[part2].add(part1);
			}

			int[] color = new int[n + 1]; // 정점의 방문 여부
			// 0 : 방문 X, 1 : part1 소속 방문O , 2: part2 소속 방문O
			boolean ok = true;

			for (int i = 1; i <= n; i++) {
				if (color[i] == 0) // 정점 i 방문 X인 상태라면,
					dfs(a, color, i, 1);
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

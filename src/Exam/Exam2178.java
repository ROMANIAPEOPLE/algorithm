package Exam;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam2178 {

	static boolean[][] visit;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int n;
	static int m;
	static int[][] result;
	static int[][] a;

	static void bfs(int i, int j, int[][] a) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { i, j });

		result[0][0] = 1;

		while (!q.isEmpty()) {

			i = q.peek()[0];
			j = q.peek()[1];
			q.poll();
			for (int x = 0; x < 4; x++) {
				int curI = i + dx[x];
				int curJ = j + dy[x];

				if (curI < 0 || curJ < 0 || curI >= n || curJ >= m)
					continue;
				if (visit[curI][curJ])
					continue;
				if (a[curI][curJ] == 0)
					continue;

				visit[curI][curJ] = true;
				q.add(new int[] { curI, curJ });
				result[curI][curJ] = result[i][j] + 1;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		a = new int[n][m];
		visit = new boolean[n][m];
		result = new int[n][m];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				a[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 1 && !visit[i][j]) {
					bfs(i, j, a);
				}
			}
		}

		System.out.println(result[n - 1][m - 1]);

	}

}

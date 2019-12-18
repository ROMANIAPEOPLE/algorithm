package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam14502_2 {

	static int n, m, ans;
	static int[][] map;
	static int[][] temp;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static class lab {
		int x, y;

		public lab(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void cloneArray() {
		temp = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				temp[i][j] = map[i][j];
			}
		}

	}

	public static void bfs() {
		Queue<lab> qu = new LinkedList<>();
		cloneArray();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (temp[i][j] == 2) {
					qu.add(new lab(i, j)); // 독가스 위치를 저장
				}
			}
		}
		while (!qu.isEmpty()) {
			lab now = qu.poll();
			int x = now.x;
			int y = now.y;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (temp[nx][ny] == 0) {
						temp[nx][ny] = 2;
						qu.add(new lab(nx, ny));
					}
				}

			}
		}
		int count =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(temp[i][j] == 0) {
					count++;
				}
			}
		}
		
		ans = Math.max(ans, count);

	}

	public static void dfs(int count) {
		if (count == 3) {
			bfs();
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					dfs(count + 1);
					map[i][j] = 0;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					dfs(1);
					map[i][j] = 0;
				}

			}
		}

		System.out.println(ans);
	}

}

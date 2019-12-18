package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Exam14502_보류 {

	public static class point {
		int x, y;

		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n;
	static int m;
	static int[][] map;
	static int[][] temp;
	static boolean[][] visit;
	static int count = Integer.MIN_VALUE;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int ans = 0;

	static void bfs() {
		Queue<point> qu = new LinkedList<>();
		for (int y = 0; y < n; y++) {
			for (int x = 0; x < m; x++) {
				temp[y][x] = map[y][x];

				if (temp[y][x] == 2) {
					qu.add(new point(y, x));
					visit[y][x] = true;

				}

			}
		}
		while (!qu.isEmpty()) {
			point now = qu.remove();
			int cy = now.y;
			int cx = now.x;

			for (int i = 0; i < 4; i++) {
				int ny = cy + dy[i];
				int nx = cx + dx[i];

				if (ny >= 0 && nx >= 0 && ny < n && nx < m) {
					if (!visit[ny][nx] && temp[ny][nx] == 0) {
						temp[ny][nx] = 2;
						visit[ny][nx] = true;
						qu.add(new point(ny, nx));
					}
				}

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (temp[i][j] == 0) {
					ans++;
				}
			}
		}

		count = Math.max(ans, count);

	}

	static void dfs(int count, int ny, int nx) {
		if (count == 3) { // 벽을 다 세웠다면 ,
			bfs(); // bfs로 바이러스를 확산시킨다.
			return;
		}

		for (int y = ny; y < n; y++) {
			for (int x = nx; x < m; x++) {
				if (map[y][x] == 0) {
					map[y][x] = 1;
					dfs(count + 1, y, x);
					map[y][x] = 0;
				}
			}
			nx = 0; // 배열 전체를 순회하기 위해, nx를 0으로 초기화
		}

	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		temp = new int[n][m];
		visit = new boolean[n][m];
		for (int y = 0; y < n; y++) {
			st = new StringTokenizer(br.readLine(), " ");
		}

	}
}

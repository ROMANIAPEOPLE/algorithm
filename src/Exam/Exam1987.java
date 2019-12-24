package Exam;

import java.util.Scanner;

public class Exam1987 {

	static int R, C;
	static char[][] map;
	static boolean[] visit = new boolean[26];
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int ans = 0;

	public static void dfs(int x, int y, int depth) {
		if (visit[map[x][y]]) {
			ans = Math.max(ans, depth);
		} else {
			visit[map[x][y]] = true;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
					dfs(nx, ny, depth + 1);
				}

			}
			
			visit[map[x][y]] = false;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		R = sc.nextInt();
		C = sc.nextInt();

		map = new char[R][C];

		for (int i = 0; i < R; i++) {
			String str = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		dfs(0,0,0);
		System.out.println(ans);

	}
}

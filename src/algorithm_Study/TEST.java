package algorithm_Study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TEST {

	static int[][] danji;
	static int[][] visit;
	static int n;
	static int count;
	static ArrayList<Integer> list = new ArrayList<>();

	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	static void bfs(int x, int y) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] { x, y });

		while (!qu.isEmpty()) {
			x = qu.peek()[0];
			y = qu.peek()[1];
			qu.poll();

			for (int i = 0; i < 4; i++) {
				int curX = x + dx[i];
				int curY = y + dy[i];
				if (curX >= 0 && curY >= 0 && curX < n && curY < n) {
					if (visit[curX][curY] == 0 && danji[curX][curY] == 1) {
						visit[curX][curY] = 1;
						count++;
						qu.add(new int[] { curX, curY });
					}
				}
			}
		}

	}

	static void dfs(int x, int y) {
		count++;
		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < n && cy < n) {
				if (danji[cx][cy] == 1 && visit[cx][cy] == 0) {
					visit[cx][cy] = 1;
					dfs(cx, cy);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		danji = new int[n][n];
		visit = new int[n][n];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < n; j++) {
				danji[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (danji[i][j] == 1 && visit[i][j] == 0) {
					visit[i][j] = 1;
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}

		System.out.println(list.size());

		for (int arr : list) {
			System.out.println(arr);
		}

	}
}
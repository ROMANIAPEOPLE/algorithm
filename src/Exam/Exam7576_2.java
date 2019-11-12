package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair {
	int x;
	int y;

	pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Exam7576_2 {
	static int n, m;
	static int[][] map;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static Queue<pair> q = new LinkedList<pair>();

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
				if (map[i][j] == 1) {
					q.add(new pair(i, j));
				}
			}
		}

		bfs();

		int max=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(max < map[i][j]) {
					max = map[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}

	public static void bfs() {

		while (!q.isEmpty()) {
			pair p = q.poll();
			int x = p.x;
			int y = p.y;

			for (int i = 0; i < 4; i++) {
				int nX = x + dx[i];
				int nY = y + dy[i];

				if (nX >= 0 && nY >= 0 && nX < n && nY < m && map[nX][nY] == 0) {
					q.add(new pair(nX, nY));
					map[nX][nY] = map[x][y] + 1;
					
				}
			}

		}

	}

}

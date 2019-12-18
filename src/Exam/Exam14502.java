package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Exam14502 {

	public static class sw{
		int x,y;
		public sw(int x, int y) {
			this.x= x;
			this.y =y;
		}
	}
	
	static int n, m;
	static int ans;
	static int[][] map;
	static int[][] a;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	
	
	public static void bfs() {
		Queue<sw> qu = new LinkedList<>();
		int [][] tempMap = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tempMap[i][j] = map[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (tempMap[i][j] == 2) {
					qu.add(new sw(i,j));
				}
			}
		}

		while (!qu.isEmpty()) {
			sw now = qu.remove();
			int x = now.x;
			int y = now.y;
			for (int i = 0; i < 4; i++) {
				int curX = x + dx[i];
				int curY = y + dy[i];
				if(curX<0 || curX>=n || curY<0 || curY>=m) continue;
				if(tempMap[curX][curY] == 2 || tempMap[curX][curY] == 1) continue;
				tempMap[curX][curY] =2;
				qu.add(new sw(curX,curY));
				
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (tempMap[i][j] == 0) {
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
				if (map[i][j] == 1 || map[i][j] == 2)
					continue;
				map[i][j] = 1;
				dfs(count + 1);
				map[i][j] = 0;
			}
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		map = new int[n][m];
		a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			map[i][j]=	a[i][j]  = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 2 || a[i][j] == 1) {
					continue;
				}
				map[i][j] = 1;
				dfs(1);
				map[i][j] = 0;

			}
		}
		System.out.println(ans);
		sc.close();

	}
}

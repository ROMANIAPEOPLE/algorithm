package Exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam4963 {

	static int[][] a;
	static boolean[][] visit;
	static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 }; // ¿ì, ÁÂ , ¿ìÇÏ, ÁÂÇÏ, »ó¿ì, »óÁÂ
    static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };
    static int w;
    static int h;


	public static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { i, j });

		while (!q.isEmpty()) {
			i = q.peek()[0];
			j = q.peek()[1];
			q.poll();
			
			for(int f=0; f<8; f++) {
				int curX = i+dx[f];
				int curY = j+dy[f];
				if(curX>=0 && curY>=0 && curX <h && curY <w && !visit[curX][curY] && a[curX][curY]==1) {
					visit[curX][curY]= true;
					q.add(new int[] {curX, curY});
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			 w = sc.nextInt();
			 h = sc.nextInt();
			if (w == 0 && h == 0)
				break;

			a = new int[h][w];
			visit = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (a[i][j] == 1 && !visit[i][j]) {
						++count;
						bfs(i, j);
					}
				}
			}
			System.out.println(count);
			
		}

	}

}

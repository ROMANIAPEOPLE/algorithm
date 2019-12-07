package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam2667 {

	static int n; // 단지번호
	static int[][] danji;
	static int[][] visit;
	static int count;
	static ArrayList<Integer> list = new ArrayList<>();
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

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
					count = 0;
					visit[i][j] = 1;
					dfs(i, j);
					list.add(count);

				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int a : list) {
			System.out.println(a);
		}

	}
}

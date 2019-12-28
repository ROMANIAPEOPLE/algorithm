package Exam;

import java.util.Scanner;

public class Exam14889_3 {

	static int[][] map;
	static int min = Integer.MAX_VALUE;
	static int n;
	static boolean[] team;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		team = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt(); // 2차원 배열을 만든다.
			}
		}
		
		backTrack(0,0);
		System.out.println(min);

	}

	public static void backTrack(int count, int current) {
		if (count == n / 2) {
			int teamA = 0;
			int teamB = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (i == j)
						continue;
					if (team[i] != team[j])
						continue;
					if (team[i]) {
						teamA += map[i][j] + map[j][i];
					} else {
						teamB += map[i][j] + map[j][i];
					}
				}

			}
			
			min= Math.min(min, Math.abs(teamA-teamB));
			return;
		}

		for (int i = current; i < n; i++) {
			team[i] = true;
			backTrack(count + 1, i + 1);
			team[i] = false;
		}

	}

}

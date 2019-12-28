package Exam;

import java.util.Scanner;

public class Exam14880_4 {

	static int min = Integer.MAX_VALUE;
	static int n;
	static int[][] map;
	static boolean[] team;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		team = new boolean[n];
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		backTrack(0, 0);
		System.out.println(min);

	}

	public static void backTrack(int index, int count) {
		if (count == n / 2) {
			cal();
			return;
		}

		for (int i = index; i < n; i++) {
			team[i] = true;
			backTrack(i + 1, count + 1);
			team[i] = false;
		}
	}

	public static void cal() {
		int teamA = 0;
		int teamB = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (team[i] && team[j]) {
					teamA += map[i][j];
				}
				
				if (!team[i] && !team[j]) {
					teamB += map[i][j];
				}

			}
		}

		min = Math.min(min, Math.abs(teamA - teamB));

	}
}
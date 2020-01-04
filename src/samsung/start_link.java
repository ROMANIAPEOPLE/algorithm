package samsung;

import java.util.Scanner;

public class start_link {

	public static int[][] map;
	public static boolean[] team;
	public static int n;
	public static int min = Integer.MAX_VALUE;

	public static void make_Team() {
		int team_Start = 0;
		int team_Link = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!team[i] && !team[j])
					team_Start += map[i][j];
				if (team[i] && team[j])
					team_Link += map[i][j];
			}
		}

		min = Math.min(min, Math.abs(team_Start - team_Link));

	}

	public static void backTrack(int index, int depth) {
		if (depth == n / 2) {
			make_Team();
			return;
		}

		for (int i = index; i < n; i++) {
			if (!team[i]) {
				team[i] = true;
				backTrack(i + 1, depth + 1);
				team[i] = false;
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		team = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		backTrack(0, 0);
		System.out.println(min);

	}
}

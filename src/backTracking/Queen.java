package backTracking;

import java.util.Scanner;

public class Queen {
	static int[] map;
	static int n;
	static int count;

	public static boolean check(int[] map, int col) {
		for (int i = 1; i < col; i++) {
			if (map[i] == map[col])
				return false;
			if (Math.abs(i - col) == Math.abs(map[i] - map[col]))
				return false;
		}
		return true;
	}

	public static void backTrack(int[] map, int col) {
		if (col == n) {
			count++;
			return;
		}

		else {
			for (int i = 1; i <= n; i++) {
				map[col + 1] = i;
				if (check(map, col + 1)) {
					backTrack(map, col + 1);
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			map = new int[n + 1];
			map[1] = i;

			backTrack(map, 1);

		}

		System.out.println(count);
		
	}
}

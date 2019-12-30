package backTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class sdoku {
	static int[][] map = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	static boolean ck;

	public static void print() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				builder.append(map[i][j] + " ");
			}

			builder.append("\n");
		}

		System.out.println(builder.toString());

	}

	public static boolean check(int x, int y, int n) {
		for (int i = 0; i < 9; i++) {
			if (map[x][i] == n)
				return false;
			if (map[i][y] == n)
				return false;
		}

		int xs = x / 3 * 3;
		int ys = y / 3 * 3;

		for (int i = xs; i < xs + 3; i++) {
			for (int j = ys; j < ys + 3; j++) {
				if (map[i][j] == n)
					return false;
			}
		}

		return true;

	}

	public static void backTrack(int index, int depth) {
		if (depth == list.size()) {
			print();
			ck=true;
			return;
		}

		if(ck) return;
		
		if (index >= list.size()) {
			return;
		}

		int x = list.get(index)[0];
		int y = list.get(index)[1];

		for (int i = 1; i <= 9; i++) {
			if (check(x, y, i)) {
				map[x][y] = i;
				backTrack(index + 1, depth + 1);
				map[x][y] = 0;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 0) {
					list.add(new int[] { i, j }); // ºñ¾îÀÖ´Â ½ºµµÄíÀÇ ÁÂÇ¥.
				}
			}
		}

		backTrack(0, 0);

	}

}

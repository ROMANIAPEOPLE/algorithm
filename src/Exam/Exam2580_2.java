package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2580_2 {

	public static int[][] sdoku = new int[9][9];
	public static ArrayList<int[]> list = new ArrayList<>();
	public static boolean isEnd;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sdoku[i][j] = sc.nextInt();

				if (sdoku[i][j] == 0) {
					list.add(new int[] { i, j });
				}
			}
		}

		backTrack(0, 0);
	}

	public static boolean check(int x, int y, int n) {
		for (int i = 0; i < 9; i++) {
			if (sdoku[x][i] == n)
				return false;
			if (sdoku[i][y] == n)
				return false;

		}
		int nx = x / 3 * 3;
		int ny = y / 3 * 3;

		for (int i = nx; i < nx + 3; i++) {
			for (int j = ny; j < ny + 3; j++) {
				if (sdoku[i][j] == n)
					return false;
			}
		}
		return true;

	}

	public static void print() {
		// 결과 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(sdoku[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void backTrack(int index, int count) {
		if (isEnd)
			return;
		
		if (list.size() == count) {
			isEnd = true;
			print();
			return;
		
		
		}
		if (index >= list.size())
			return;

		int x = list.get(index)[0];
		int y = list.get(index)[1];

		for (int i = 1; i <= 9; i++) {
			if (check(x, y, i)) {
				sdoku[x][y] = i;
				backTrack(index + 1, count + 1);
			}

		}
	}
}

package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2580_3 {

	static int[][] sdoku = new int[9][9];
	static boolean check;
	static ArrayList<int[]> list = new ArrayList<>();

	public static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(sdoku[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	static boolean check(int x, int y, int n) {
		for (int i = 0; i < 9; i++) {
			if (sdoku[x][i] == n) {
				return false;
			}
			if (sdoku[i][y] == n) {
				return false;
			}
		}
		int xs = x / 3 * 3;
		int ys = y / 3 * 3;

		for (int i = xs; i < xs + 3; i++) {
			for (int j = ys; j < ys + 3; j++) {
				if (sdoku[i][j] == n) {
					return false;
				}

			}
		}
		return true;
	}

	static void backTrack(int index) {
		if (index == list.size()) {
			print();
			check = true;
			return;
		}
		if (check) {
			return;
		}

		if (index >= list.size())
			return;
		// index는0부터니까 >=가 맞음.

		// 비어있는 곳의 좌표
		int x = list.get(index)[0];
		int y = list.get(index)[1];

		for (int i = 1; i <= 9; i++) {
			if (check(x, y, i)) {
				sdoku[x][y] = i;
				backTrack(index + 1);
				sdoku[x][y] = 0;
			}

		}

	}

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

		backTrack(0);
		
	}

}

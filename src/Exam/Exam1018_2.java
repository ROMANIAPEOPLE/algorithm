package Exam;

import java.util.Scanner;

public class Exam1018_2 {
	static char[][] whiteFirstChess = new char[8][8];
	static char[][] blackFirstChess = new char[8][8];
	static int count = Integer.MAX_VALUE;

	public static void buildChess() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 || j % 2 == 0) && (i % 2 != 0 || j % 2 != 0)) {
					whiteFirstChess[i][j] = 'W';
				} else {
					whiteFirstChess[i][j] = 'B';
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 || j % 2 == 0) && (i % 2 != 0 || j % 2 != 0)) {
					blackFirstChess[i][j] = 'B';
				} else {
					blackFirstChess[i][j] = 'W';
				}
			}
		}

	}

	public static void compareChess(char[][] myChess, int x, int y) {
		int temp = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (myChess[i + x][j + y] != whiteFirstChess[i][j]) {
					temp++;
				}
			}
		}
		count = Math.min(count, temp);

		temp = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (myChess[i + x][j + y] != blackFirstChess[i][j]) {
					temp++;
				}
			}
		}

		count = Math.min(count, temp);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] myChess = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				myChess[i][j] = s.charAt(j);
			}
		}

		buildChess();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i + 8 <= n && j + 8 <= m) {
					compareChess(myChess, i, j);
				}
			}
		}
		
		System.out.println(count);

	}

}

package Exam;

import java.util.Scanner;

public class Exam9663 {

	static int[] col;
	static int n;
	static int ans;

	public static boolean isPossible(int[] col, int row) {
		for (int i = 1; i < row; i++) {
			if (col[i] == col[row])
				return false;
			// 같은 열에 있는 경우
			if (Math.abs(i - row) == Math.abs(col[i] - col[row]))
				return false;
			// 대각선에 있는 경우.
		}

		return true;
	}

	public static void dfs(int[] col, int row) {
		if (row == n) {
			ans++;
		}

		else {
			// 1열부터 n+1열까지 반복하면서, (row+1,i)에 퀸을 놓을 수 있는 경우가
			// 있는지 확인 후, 있다면 다음행의 dfs를 호출한다.
			for (int i = 1; i < n + 1; i++) {
				col[row + 1] = i; // row+1행에 i열에 퀸을 놓을 수 있을까?
				if (isPossible(col, row + 1)) {
					dfs(col, row + 1);
					// 놓을 수 있다면, 다음 행으로 이동.
				}

			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			col = new int[n + 1]; // 0은 사용 안함!
			col[1] = i; // 1행 i열에 퀸을 좋았다.
			dfs(col, 1); // 1행 i열에 퀸을 놓았을 경우, 가능한 횟수
		}
		
		System.out.println(ans);

	}

}

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
			// ���� ���� �ִ� ���
			if (Math.abs(i - row) == Math.abs(col[i] - col[row]))
				return false;
			// �밢���� �ִ� ���.
		}

		return true;
	}

	public static void dfs(int[] col, int row) {
		if (row == n) {
			ans++;
		}

		else {
			// 1������ n+1������ �ݺ��ϸ鼭, (row+1,i)�� ���� ���� �� �ִ� ��찡
			// �ִ��� Ȯ�� ��, �ִٸ� �������� dfs�� ȣ���Ѵ�.
			for (int i = 1; i < n + 1; i++) {
				col[row + 1] = i; // row+1�࿡ i���� ���� ���� �� ������?
				if (isPossible(col, row + 1)) {
					dfs(col, row + 1);
					// ���� �� �ִٸ�, ���� ������ �̵�.
				}

			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			col = new int[n + 1]; // 0�� ��� ����!
			col[1] = i; // 1�� i���� ���� ���Ҵ�.
			dfs(col, 1); // 1�� i���� ���� ������ ���, ������ Ƚ��
		}
		
		System.out.println(ans);

	}

}

package algorithm_Study;

import java.util.ArrayList;
import java.util.Scanner;

public class ������ {

	static int[][] sdoku = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	static boolean check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sdoku[i][j] = sc.nextInt(); // ������ ��ȣ�� �Է¹޴´�.
				if (sdoku[i][j] == 0) { // �Է¹��� ��ȣ�� 0 ��, ����ִٸ� list�� �߰���Ų��.
					list.add(new int[] { i, j });
				}
			}
		}

		backTracking(0, 0); // inddex�� count�� ������ 0,0 �̴�.
		// -> index : ����ִ� �ڸ��� ������ list�� �ϳ��� ������ ����Ѵ�.
		// -> count : list�� ũ��(size)��ŭ count�� �����Ѵٸ�, ����ִ� �ڸ��� ���ڸ� ��� ä���ٴ� ���̴�.
	}

	public static void backTracking(int index, int count) {
		if (count == list.size()) {
			print();
			check = true;
			return;
		}
		if (check)
			return;
		if (index >= list.size())
			return;

		int x = list.get(index)[0]; // ����ִ� �ڸ��� x��ǥ
		int y = list.get(index)[1]; // ����ִ� �ڸ��� y��ǥ

		for (int i = 1; i <= 9; i++) {
			if (check(x, y, i)) {
				sdoku[x][y] = i;
				backTracking(index + 1, count + 1);
				sdoku[x][y] = 0;
			}

		}
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
		// ��� ���
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(sdoku[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}

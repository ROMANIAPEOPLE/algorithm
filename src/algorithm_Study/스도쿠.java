package algorithm_Study;

import java.util.ArrayList;
import java.util.Scanner;

public class 스도쿠 {

	static int[][] sdoku = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	static boolean check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sdoku[i][j] = sc.nextInt(); // 스도쿠 번호를 입력받는다.
				if (sdoku[i][j] == 0) { // 입력받은 번호가 0 즉, 비어있다면 list에 추가시킨다.
					list.add(new int[] { i, j });
				}
			}
		}

		backTracking(0, 0); // inddex와 count의 시작은 0,0 이다.
		// -> index : 비어있는 자리를 저장한 list를 하나씩 꺼낼때 사용한다.
		// -> count : list의 크기(size)만큼 count가 도달한다면, 비어있는 자리에 숫자를 모두 채웠다는 뜻이다.
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

		int x = list.get(index)[0]; // 비어있는 자리의 x좌표
		int y = list.get(index)[1]; // 비어있는 자리의 y좌표

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

}

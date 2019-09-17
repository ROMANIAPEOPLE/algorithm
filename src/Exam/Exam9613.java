package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam9613 {

	static int GCD(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		} else {
			return GCD(n2, n1 % n2);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int n = sc.nextInt();

			list.clear();
			for (int j = 0; j < n; j++) {// 두번째 테스트케이스
				list.add(sc.nextInt()); // 숫자 넣어주기
			}
			int ans = 0;

			for (int x = 0; x < list.size() - 1; x++) {
				for (int c = x + 1; c < list.size(); c++) {
					ans += GCD(list.get(x), list.get(c));

				}
			}

			System.out.println(ans);
		}

	}

}

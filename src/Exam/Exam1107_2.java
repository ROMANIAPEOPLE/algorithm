package Exam;

import java.util.Scanner;

public class Exam1107_2 {

	static boolean[] broken = new boolean[10]; // 0~10

	static int possible(int c) {
		if (c == 0) {
			if (broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0;
			}
			len += 1;
			c /= 10;
		}
		return len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 이동 원하는 채널
		int m = sc.nextInt(); // 고자안 채널 갯수
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			broken[x] = true; // 트루면 고장!
		}

		int ans = Math.abs(n - 100);
		// 초기 채널은 100이다. 모든 리모콘의 숫자버튼이 고장났을 경우, +,-버튼으로만
		// 이동 가능하도록 초기값을 설정해준다.

		for (int i = 0; i < 1000000; i++) {
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = Math.abs(c - n);
				if (ans > len + press) {
					ans = len + press;
				}

			}

		}
		System.out.println(ans);
	}
}

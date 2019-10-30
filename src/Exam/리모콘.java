package Exam;

import java.util.Scanner;

public class 리모콘 {

	static boolean[] broken = new boolean[10];

	static int check(int c) {
		int len = 0;
		if (c == 0) {
			if (broken[0]) {
				return 0;
			} else
				return 1;
		}

		else {
			while (c > 0) {
				if (broken[c % 10]) {
					return 0;
				}
				len += 1;
				c /= 10;
			}
			return len;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			broken[x] = true; // 고장난버튼
		}

		int ans = Math.abs(n - 100); // 모든키가 고장났다는 가정을 한 ans

		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int cnt = check(c); // c채널로 이동가능한지, 가능하다면 몇번눌르는지

			if (cnt > 0) {
				int press = Math.abs(c - n);

				if (ans > press + cnt) {
					ans = press + cnt;
				}
			}
		}
		System.out.println(ans);

	}

}

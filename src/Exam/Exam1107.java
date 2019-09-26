 package Exam;

import java.util.*;

public class Exam1107 {
	static boolean[] broken = new boolean[10];
	//true => 고장 
	//false =>노고장
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //이동하려는 채널
		int m = sc.nextInt(); //고장난 버튼 개수
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt(); //고장난 버튼 추가
			broken[x] = true;
		}
		int ans = n - 100;
		if (ans < 0) {
			ans = -ans;  // +,-뺴고 모든 리모컨의 키가 고장났을때를 초기값으로 설정한다.
		}
		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = c - n;
				if (press < 0) {
					press = -press;
				}
				if (ans > len + press) {
					ans = len + press;
				}
			}
		}
		System.out.println(ans);
	}
}
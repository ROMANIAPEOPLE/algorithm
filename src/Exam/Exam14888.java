package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam14888 {

	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static ArrayList<Character> list = new ArrayList<>();
	static int[] map;
	static char[] operator = { '+', '-', '*', '/' };
	static boolean[] visit;
	static int n;

	public static void cal(String s) {
		int index = 1;
		int result = map[0];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				result += map[index++];
			} else if (s.charAt(i) == '-') {
				result -= map[index++];
			} else if (s.charAt(i) == '*') {
				result *= map[index++];
			} else if (s.charAt(i) == '/') {
				result /= map[index++];
			}
		}

		min = Math.min(min, result);
		max = Math.max(max, result);
	}

	public static void backTrack(String s) {
		if (s.length() == n - 1) {
			cal(s);
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if (!visit[i]) {
				visit[i] = true;
				backTrack(s + list.get(i));
				visit[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n];
		visit = new boolean[n - 1];
		for (int i = 0; i < n; i++) {
			map[i] = sc.nextInt();// n개의 수열 입력
		}

		for (int i = 0; i < 4; i++) {
			int z = sc.nextInt();
			for (int j = 0; j < z; j++) {
				list.add(operator[i]);
			}
		}

		backTrack("");
		System.out.println(max);
		System.out.println(min);
		// 연산자의 수 만큼, 탐색 진행

	}
}

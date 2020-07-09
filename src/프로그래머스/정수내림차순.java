package 프로그래머스;

import java.util.Arrays;

public class 정수내림차순 {

	public static void main(String[] args) {

		System.out.println(solution(382747819));

	}

	public static long solution(long n) {
		long answer = 0;
		String[] s = String.valueOf(n).split("");

		Arrays.sort(s, (o1, o2) -> o2.charAt(0) - o1.charAt(0));

		String temp = "";

		for (int i = 0; i < s.length; i++) {
			temp += s[i];
		}
		answer = Long.parseLong(temp);
		return answer;
	}

}

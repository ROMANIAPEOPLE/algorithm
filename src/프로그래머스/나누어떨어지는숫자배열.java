package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 6 };
		int divisor = 10;
		System.out.println(Arrays.toString(solution(arr, divisor)));

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if (list.isEmpty()) {
			list.add(-1);
		}

		answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		Arrays.parallelSort(answer);

		return answer;

	}
}
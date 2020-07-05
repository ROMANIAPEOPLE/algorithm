package ���α׷��ӽ�;

import java.util.ArrayList;
import java.util.Arrays;

public class ����������¼��ڹ迭 {
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
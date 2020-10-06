package 프로그래머스;

import java.util.Arrays;

public class 시크릿맵 {

	public static void main(String[] args) {
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
		int n = 6;
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));

		
		
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {

		String[] answer = new String[n];

		int[] sum = new int[n];

		for (int i = 0; i < n; i++) {
			sum[i] = (arr1[i] | arr2[i]);
		}

		String temp = "";

		for (int i = 0; i < answer.length; i++) {
			temp = "";
			for (int j = 0; j < n; j++) {
				if (sum[i] % 2 == 1) {
					temp = "#" + temp;
				} else {
					temp = " " + temp;
				}
				sum[i] = sum[i] / 2;
			}

			answer[i] = temp;
			
		}

		return answer;

	}

}

package inflearn_codingTest.StringAndArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {
	public static void main(String[] args) {

		int[] A = { 11, 27, 45, 31, 50 };
		int[] B = { 50, 11, 31, 45, 27 };

		int[] result = solve(A, B);

		print(result);
	}

	public static int[] solve(int[] A, int[] B) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < B.length; i++) {
			map.put(B[i], i);
		}

		int[] result = new int[B.length];

		for (int i = 0; i < A.length; i++) {
			result[i] = map.get(A[i]);
		}

		return result;
	}

	public static void print(int[] result) {
		System.out.println(Arrays.toString(result));
	}

}

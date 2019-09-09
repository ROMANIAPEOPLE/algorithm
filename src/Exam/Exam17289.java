package Exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Exam17289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {

			while (!st.isEmpty() && arr[i] >= st.peek()) {
				st.pop();
			}

			if (st.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = st.peek();
			}

			st.push(arr[i]);
		}
		
		System.out.println(Arrays.toString(result));

	}
}

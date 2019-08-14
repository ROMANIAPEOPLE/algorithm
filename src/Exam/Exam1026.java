package Exam;

import java.util.Arrays;
import java.util.Scanner;

// 가장 작은값 X 가장 큰값

public class Exam1026 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int[] a, int start, int end) {
		int value = a[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (a[j] > value) {
				swap(a, ++i, j);
			}
		}

		swap(a, i + 1, end);
		return i + 1;

	}

	static void quickSortDesc(int[] a, int start, int end) {

		if (start >= end)
			return;
		int middle = partition(a, start, end);
		quickSortDesc(a, start, middle - 1);
		quickSortDesc(a, middle + 1, end);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		Arrays.sort(A);
		quickSortDesc(B, 0, B.length - 1);

		int result = 0;

		for (int i = 0; i < N; i++) {
			result += A[i] * B[i];
		}

		System.out.println(result);

	}

}
package TSET;

import java.util.Arrays;
import java.util.Scanner;

public class OoO {

	static void swap(int[] a, int i, int j) {

		int temp = a[i];

		a[i] = a[j];

		a[j] = temp;

	}

	static int partition(int[] a, int start, int end) {

		int value = a[end];

		int i = start - 1;

		for (int j = start; j < end - 1; ++j)

			if (a[j] < value)

				swap(a, ++i, j);

		swap(a, i + 1, end);

		return i + 1;

	}

	static void JJ(int[] a, int start, int end) {

		if (start >= end)
			return;

		int middle = partition(a, start, end);

		JJ(a, start, middle - 1);

		JJ(a, middle + 1, end);

	}

	public static void main(	String[] args) {
		int[] j = { 2, 5, 3, 4 };

		JJ(j, 0, 3);
		System.out.println(Arrays.toString(j));

	}
}
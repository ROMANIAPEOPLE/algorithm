package Exam;

import java.util.Scanner;

public class Exam10973 {
	static boolean before_number(int[] a) {

		int i = a.length - 1;
		while (i > 0 && a[i] >= a[i - 1]) {
			i--;
		}

		if (i <= 0) {
			return false;
		}

		int j = a.length - 1;
		while (a[i - 1] <= a[j]) {
			j--;
		}
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;

		j = a.length - 1;
		while (i < j) {

			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수열의 갯수 입력
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		if (before_number(a)) {
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println(-1);
		}
	}
}

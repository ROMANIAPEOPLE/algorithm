package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exam6603 {
	static boolean next_num(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i--;
		}

		if (i <= 0)
			return false;

		int j = a.length - 1;
		while (a[i - 1] >= a[j]) {
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

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int[] d = new int[n];
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				if (i < n - 6) {
					d[i] = 0; // »ç¿ëx
				} else {
					d[i] = 1;
				}
			}
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();

			}
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			do {

				ArrayList<Integer> list = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					if (d[i] == 1) {
						list.add(a[i]);
					}

				}
				ans.add(list);

			} while (next_num(d));

			Collections.reverse(ans);

			for (ArrayList<Integer> v : ans) {
				for (int x : v) {
					System.out.print(x + " ");
				}
				System.out.println();
			}
			System.out.println();

		}

	}
}

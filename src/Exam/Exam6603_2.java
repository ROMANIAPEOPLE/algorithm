package Exam;

import java.util.Scanner;

public class Exam6603_2 {

	static int[] arr;
	static int[] result;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;

			arr = new int[n];
			result = new int[6];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			dfs(0, 0);
			System.out.println();
		}
	}

	public static void dfs(int index, int count) {
		if (count == 6) {
			for (int i = 0; i < 6; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = index; i < n; i++) {
			result[count] = arr[i];
			dfs(i + 1, count + 1);

		}
	}
}
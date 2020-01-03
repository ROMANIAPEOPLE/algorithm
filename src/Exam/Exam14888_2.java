package Exam;

import java.util.Scanner;

public class Exam14888_2 {
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	public static int n;
	public static int[] operator;
	public static int[] arr;

	public static void dfs(int index, int result) {
		if (index == n) {
			min = Math.min(min, result);
			max = Math.max(max, result);
			return;
		}

		if (operator[0] > 0) {
			operator[0]--;
			dfs(index + 1, result + arr[index]);
			operator[0]++;
		}

		if (operator[1] > 0) {
			operator[1]--;
			dfs(index + 1, result - arr[index]);
			operator[1]++;
		}

		if (operator[2] > 0) {
			operator[2]--;
			dfs(index + 1, result * arr[index]);
			operator[2]++;
		}

		if (operator[3] > 0) {
			operator[3]--;
			dfs(index + 1, result / arr[index]);
			operator[3]++;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n];
		operator = new int[4];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			operator[i] = sc.nextInt();
		}

		dfs(1, arr[0]);

		System.out.println(max);
		System.out.println(min);

	}
}

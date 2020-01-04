package samsung;

import java.util.Scanner;

public class operator {

	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	public static int[] operator;
	public static int[] a;
	public static int n;

	public static void backTrack(int index, int result) {
		if (index == n) {
			min = Math.min(min, result);
			max = Math.max(max, result);
			return;
		}

		if (operator[0] > 0) {
			operator[0]--;
			backTrack(index + 1, result + a[index]);
			operator[0]++;
		}
		if (operator[1] > 0) {
			operator[1]--;
			backTrack(index + 1, result - a[index]);
			operator[1]++;
		}
		if (operator[2] > 0) {
			operator[2]--;
			backTrack(index + 1, result * a[index]);
			operator[2]++;

		}
		if (operator[3] > 0) {
			operator[3]--;
			backTrack(index + 1, result / a[index]);
			operator[3]++;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		operator = new int[4];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) { // .
			operator[i] = sc.nextInt();
		}

		backTrack(1, a[0]);
		System.out.println(max);
		System.out.println(min);

	}

}

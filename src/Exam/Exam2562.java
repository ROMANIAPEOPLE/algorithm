package Exam;

import java.util.Scanner;

public class Exam2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int[] arr = new int[9];

		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				index = i+1;
				maxValue = arr[i];
			}

		}
		System.out.println(maxValue);
		System.out.println(index);

	}
}

package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam9020_시간초과 {

	public static ArrayList<Integer> list = new ArrayList<>(); // 소수 저장
	public static int n;
	public static int min = Integer.MAX_VALUE;
	public static int x, y;

	public static void gold(int n) {
		min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == n) {
					int temp = Math.abs((list.get(i) - list.get(j)));

					if (min > temp) {
						x = list.get(i);
						y = list.get(j);
						min = temp;

					}

				}
			}
		}
	}

	public static void save_Prime() {
		boolean[] check = new boolean[10001];
		for (int i = 2; i <= 10000; i++) {
			if (!check[i]) {
				list.add(i);
			}
			for (int j = i * 2; j <= 10000; j += i) {
				check[j] = true;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			n = sc.nextInt();
			save_Prime();
			gold(n);
			System.out.print(x + " " + y);
			System.out.println();
		}
	}
}

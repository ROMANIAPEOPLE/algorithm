package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam17087 {

	static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int testCase = sc.nextInt(); // 동생 몇 명?
		int s = sc.nextInt(); // 현재 나의 위치

		for (int i = 0; i < testCase; i++) {
			list.add(sc.nextInt());
		}

		for (int i = 0; i < list.size(); i++) {
			list2.add(Math.abs(s - list.get(i)));
		}
		int gcd = list2.get(0);

		for (int i = 1; i < list2.size(); i++) {
			gcd = GCD(gcd, list2.get(i));
		}

		System.out.println(gcd);

	}

}

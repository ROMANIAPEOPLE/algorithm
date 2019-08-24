package Exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exam2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		int n = sc.nextInt(); // 경우의 수 몇개?
		int m = sc.nextInt(); // 사회자의 외침

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		int result = 0;

		for (int i = 0; i < list.size() - 2; i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {
				for (int z = j + 1; z < list.size(); z++) {
					int ans = list.get(i) + list.get(j) + list.get(z);
					if (ans <= m)
						result = Math.max(ans, result);
				}
			}
		}

		System.out.println(result);

	}
}

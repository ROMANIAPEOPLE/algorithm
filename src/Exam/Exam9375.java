package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Exam9375 {

	static HashMap<String, Integer> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int n = sc.nextInt();
			map = new HashMap<String, Integer>();
			sc.nextLine();

			for (int i = 0; i < n; i++) {
				String str = sc.nextLine();
				String[] s = str.split(" ");

				Integer value = map.get(s[1]);
				if (value == null) {
					value = 1;
				} else {
					value += 1;
				}

				map.put(s[1], value);
			}

			int result = 1;

			for (String v : map.keySet()) {
				result *= (map.get(v) + 1);
			}

			System.out.println(result - 1);
		}
	}
}

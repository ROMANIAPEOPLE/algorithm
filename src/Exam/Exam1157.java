package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam1157 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int maxValue = 0;
		String maxKey = "";

		String s = sc.nextLine().toUpperCase();

		String[] str = new String[s.length()];

		for (int i = 0; i < str.length; i++) {
			str[i] = s.substring(i, i + 1);
		}

		for (String one : str) {
			Integer count = map.get(one);
			if (count == null) {
				count = 1;
			} else {
				count++;
			}

			map.put(one, count);
		}

		for (String two : map.keySet()) {
			if (map.get(two) > maxValue) {
				maxValue = map.get(two);
				maxKey = two;
			}
			else if(maxValue == map.get(two)) {
				maxKey = "?";
			}
		}

		System.out.println(maxKey);

	}
}
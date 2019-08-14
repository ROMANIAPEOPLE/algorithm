package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam9012_2 {

	static boolean check(String str, Stack st) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				st.push(str.charAt(i));
			} else {
				if (!st.empty()) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		return st.empty();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		int num = sc.nextInt();
		String s = null;

		for (int i = 0; i < num; i++) {
			s = sc.next();
			System.out.println(check(s, st) == true ? "YES" : "NO");
			st.clear();
		}

	}

}

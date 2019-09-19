package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam4949 {
	static boolean check(Stack<Character> st, char c) {
		if (st.peek() == '(' && c == ')') {
			return true;
		} else if (st.peek() == '[' && c == ']') {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.nextLine();
			if (s.equals(".")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) == '(') || (s.charAt(i) == '[')) {
					st.push(s.charAt(i));
				}

				else if ((s.charAt(i) == ')') || (s.charAt(i) == ']')) {
					if (!st.isEmpty()) {

						if (check(st, s.charAt(i))) {
							st.pop();
						}
					} else {// 만약 스택이 비어있는데 )또는 ]를 만났다면.
						st.push(s.charAt(i));
					}
				}

			}

			if (st.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");

			st.clear();

		}
	}

}

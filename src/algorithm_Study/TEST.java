package algorithm_Study;

import java.util.Scanner;
import java.util.Stack;

public class TEST {

	static boolean check(String s, Stack stack) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if (!stack.empty()) {
					stack.pop();
				} else {
					return false;
				}

			}
		}
		return stack.empty();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> stack = new Stack<String>();
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			String s = sc.next();
			System.out.println(check(s, stack) == true ? "YES" : "NO");
			stack.clear();
		}

	}

}

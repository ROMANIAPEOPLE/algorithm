package StringAndArray;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String strs = "()[]{}";

		System.out.println(solve(strs));
	}

	public static boolean solve(String strs) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < strs.length(); i++) {
			switch (strs.charAt(i)) {
			case ')':
				if (!st.empty() && st.peek() == '(') {
					st.pop();
					break;
				}
			case ']':
				if (!st.empty() && st.peek() == '[') {
					st.pop();
					break;
				}
			case '}':
				if (!st.empty() && st.peek() == '{') {
					st.pop();
					break;
				}

			default:
				st.push(strs.charAt(i));
				break;
			}

		}
		return st.empty();
	}
}

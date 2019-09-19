package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam4949_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		while (true) {
			String s = sc.nextLine();
			if (s.equals("."))
				break;
			boolean check = false;
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) == '(') || s.charAt(i) == '[') {
					st.push(s.charAt(i));
				} else if ((s.charAt(i) == ')') && !st.isEmpty()) {
					if (st.peek() == '(') {
						st.pop();
					} else {
						check = true; // 肋给等 褒龋
					}
				} else if ((s.charAt(i) == ']') && !st.isEmpty()) {
					if (st.peek() == '[') {
						st.pop();
					} else {
						check = true; // 肋给等 褒龋
					}
				}

				else if ((s.charAt(i) == ']' || s.charAt(i) == ')')) {
					if (st.isEmpty()) {
						check = true;// 肋给等 褒龋
					}
				}

			}
			st.clear();
			if (check || st.isEmpty())
				System.out.println("no");
			else 
				System.out.println("yes");

		}

	}
}

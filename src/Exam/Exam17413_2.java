package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam17413_2 {

	static void reversePrint(Stack<Character> st) {
		while (!st.empty()) {
			System.out.print(st.peek());
			st.pop();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		Stack<Character> st = new Stack<>();
		boolean check = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				reversePrint(st);
				check = true;
				System.out.print(s.charAt(i	));
			} else if (s.charAt(i) == '>') {
				check = false;
				System.out.print(s.charAt(i));
			}

			else if (check) {
				System.out.print(s.charAt(i));
			}

			else {
				if (s.charAt(i) == ' ') {
					reversePrint(st);
					System.out.print(s.charAt(i));
				}

				else {
					st.push(s.charAt(i));
				}
			}

		}

		reversePrint(st);

	}
}

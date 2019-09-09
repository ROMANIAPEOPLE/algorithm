package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam17413 {

	static void print(Stack<Character> st) {
		while (!st.empty()) {
			System.out.print(st.peek());
			st.pop();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack();

		String s = sc.nextLine();
		boolean check = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				print(st); // <�� ������ ���²� �����ص� ���ڿ� �Ųٷ� ���
				check = true;
				System.out.print(s.charAt(i));
			} else if (s.charAt(i) == '>') {
				check = false;
				System.out.print(s.charAt(i));
			} else if (check) {
				System.out.print(s.charAt(i));
			}

			else {
				if (s.charAt(i) == ' ') {
					print(st);
					System.out.print(s.charAt(i));
				}

				else {
					st.push(s.charAt(i));
				}
			}

		}

		print(st);

	}

}

package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam2504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int value = 1;
		int ans = 0;
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {

			case '(':
				st.push('(');
				value *= 2;
				break;

			case '[':
				st.push('[');
				value *= 3;
				break;
			
			case ')':
				if(st.isEmpty() || st.peek() != '(') {
					ans=0;
					break;
				}
				
				if(s.charAt(i-1) == '(' ) {
					ans+=value;
				}
				st.pop();
				value /=2;
				break;
				
			case ']':
				if(st.isEmpty() || st.peek() != '[') {
					ans=0;
					break;
				}
				if(s.charAt(i-1) == '[') {
					ans+=value;
				}
				st.pop();
				value /=3;
				break;
			}
		}
		
		System.out.println(!st.isEmpty() ? 0 : ans);
		
	}

}

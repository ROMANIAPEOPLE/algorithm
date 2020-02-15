package programmers.stack_queue;

import java.util.Stack;

public class ¼è¸·´ë±â {
	public int solution(String arrangement) {

		int count = 0;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i)  == '(') {
				st.push(i);
			} else {
				if (st.peek() == i - 1) {
					st.pop();
					count += st.size();
				} else {
					st.pop();
					count++;
				}
			}

		}

		return count;

	}
}

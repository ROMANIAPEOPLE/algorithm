package 블로그문제복습;

import java.util.Stack;

public class 야구게임스택 {
	public static void main(String[] args) {
		String[] strs = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(solve(strs));
	}

	public static int solve(String[] str) {
		Stack<Integer> st = new Stack<>();
		for (String s : str) {
			switch (s) {
			case "C": 
				st.pop();
				break;
			case "D":
				st.push(st.peek()*2);
				break;
			case "+":
				int t1 = st.pop();
				int t2 = st.pop();
				
				st.push(t2);
				st.push(t1);
				st.push(t1+t2);
				break;
			default:
				st.push(Integer.parseInt(s));
			}

		}
		int res=0;
		while(!st.isEmpty()) {
			res+=st.pop();
		}
		return res;
	}

}

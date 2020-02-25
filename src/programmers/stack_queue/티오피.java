package programmers.stack_queue;

import java.util.Stack;

public class Æ¼¿ÀÇÇ {
	public int[] solution(int[] heights) {
		Stack<int[]> st = new Stack<int[]>();
		int [] result = new int[heights.length];
		for(int i=0; i<heights.length; i++) {
			while(!st.isEmpty()) {
				if(st.peek()[1] > heights[i]) {
					result[i] = st.peek()[0]+1;
					break;
				}
				st.pop();
			}
			
			if(st.isEmpty()) {
				result[i] = 0;
			}
			
			st.push(new int[] {i, heights[i]});
			
		}
		return result;
		
	}
}

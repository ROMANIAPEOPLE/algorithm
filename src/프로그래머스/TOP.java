package 프로그래머스;

import java.util.Stack;

public class TOP {
	public int[] solution(int[] heights) {
		int[] res = new int[heights.length];

		Stack<int[]> st = new Stack<>();

		
		for(int i=0; i<heights.length; i++) {
			while(!st.isEmpty()) {
				if(st.peek()[1] > heights[i]) {
					res[i] = st.peek()[0]+1;
					break;
				}
				st.pop();
				
			}
			
			if(st.isEmpty()) {
				res[i]=0;
			}
		
		
			st.push(new int[] {i,heights[i]});
			
		}
		
		

		return res;
		
		
	}
}

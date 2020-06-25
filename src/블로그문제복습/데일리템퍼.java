package 블로그문제복습;

import java.util.Stack;

public class 데일리템퍼 {
	public static void main(String[] args) {
		int [] nums = {73,74,75,71,69,72,76,73};
		Stack<Integer> st = new Stack<>();
		int[] res = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			while(!st.isEmpty() && nums[st.peek()] < nums[i]) {
				res[st.peek()] = i-st.pop();
			}
			
			st.push(i);
		}
		
		
		for(int r : res) {
			System.out.print(r+" ");
		}
		
	}
	
}

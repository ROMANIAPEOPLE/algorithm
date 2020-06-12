package 블로그문제복습;

import java.util.Stack;

//1,4, 3, 2, 1, 0
public class 온도변화 {  
	static int[] arr = { 19, 24, 22, 19, 19, 30 };
	static int[] res = new int[arr.length];
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
	
		for(int i=0; i<arr.length; i++) {
			
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				res[st.peek()] = i-st.pop();
			}
			
			st.push(i);
		}
	
		
		for(int r : res) {
			System.out.print(r+" ");
		}
		
	}
	
}

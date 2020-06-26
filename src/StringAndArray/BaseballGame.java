package StringAndArray;

import java.util.Stack;

public class BaseballGame {

	//숫자오면 그냥 넣어주고,
	//C 만나면 peek의 데이터를 삭제해주고,
	//D 만나면 peek의 데이터를 x2 해서 넣어주고,
	//+ 만나면 Peek와 그다음 peek의 합한 값을 넣어준다.
	
	
	
	public static void main(String[] args) {
	
		String[] strs = {"5","-2","4","C","D","9","+","+"};		
		System.out.println(points(strs));
	}
	
	public static int points(String[] strs) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<strs.length; i++) {
			
			if(strs[i]!="D" && strs[i] !="C" && strs[i] !="+") {
				stack.add(Integer.parseInt(strs[i]));
			}
			
			if(strs[i] == "C" && !stack.isEmpty()) {
				stack.pop();
			}
			
			if(strs[i] == "D") {
				stack.add(stack.peek()*2);
			}
			
			if(strs[i] == "+") {
				Integer temp1 = stack.pop();
				Integer temp2 = stack.pop();
				
				Integer sum = temp1+temp2;
				
				stack.add(temp2);
				stack.add(temp1);
				stack.add(sum);
			}
			
		}
		
		int res = 0;
		while(!stack.isEmpty()) {
			res+=stack.pop();
		}
		return res;
	}
}

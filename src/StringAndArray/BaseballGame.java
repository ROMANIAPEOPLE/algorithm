package StringAndArray;

import java.util.Stack;

public class BaseballGame {

	//���ڿ��� �׳� �־��ְ�,
	//C ������ peek�� �����͸� �������ְ�,
	//D ������ peek�� �����͸� x2 �ؼ� �־��ְ�,
	//+ ������ Peek�� �״��� peek�� ���� ���� �־��ش�.
	
	
	
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

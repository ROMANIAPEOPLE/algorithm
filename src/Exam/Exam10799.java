package Exam;

import java.util.Scanner;
import java.util.Stack;

public class Exam10799 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		
		Stack<Integer> st = new Stack<>();
		int ans=0;
		int index=1;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(index);
			}
			else { // ')' 
				if(index-st.peek()==1) {
					st.pop();
					ans+=st.size();
				}
				else {
					st.pop();
					ans+=1;
				}
				
			}
			
			index++;
		}
		
		
		System.out.println(ans);
		
	}

}

package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Exam10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Integer> stack = new Stack<>();
		st = new StringTokenizer(br.readLine());

		int testCase = Integer.parseInt(st.nextToken());

		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			if (n == 0 && !stack.empty()) {
				stack.pop();
			} else {
				stack.push(n);
			}

		}
		
	
		int ans=0;
		while(!stack.empty()) {
			ans+=stack.pop();
		}
	
		System.out.println(ans);
	}

}

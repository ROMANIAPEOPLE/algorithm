package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Exam17289_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stt;
		stt= new StringTokenizer(br.readLine());
		int n = Integer.parseInt(stt.nextToken());
		int[] arr = new int[n];
		int[] result = new int[n];
		Stack<Integer> st = new Stack<>();
		StringBuilder builder = new StringBuilder();

		stt=new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stt.nextToken());
		}

		st.push(0);

		for (int i = 1; i < n; i++) {
			if (st.empty()) {
				st.push(i);
			}

			while (!st.empty() && arr[st.peek()] < arr[i]) {
				result[st.peek()] = arr[i];
				st.pop();
			}

			st.push(i);

		}

		while (!st.empty()) {
			result[st.peek()] = -1;
			st.pop();
		}

		for(int r : result) {
			builder.append(r+" ");
		}

		
		System.out.println(builder.toString());
	}

}

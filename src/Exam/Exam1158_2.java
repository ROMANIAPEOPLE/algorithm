package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Exam1158_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringBuilder builder = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		builder.append("<");
		while (!q.isEmpty()) {
			count++;
			if (count == k) {
				count = 0;
				builder.append(q.poll() + ", ");
			} else {
				q.add(q.poll());
			}

		}

		builder.append(">");
		builder.delete(builder.length() - 3, builder.length() - 1);

		System.out.println(builder.toString());

	}

}

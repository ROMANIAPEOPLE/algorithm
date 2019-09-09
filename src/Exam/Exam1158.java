package Exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Exam1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int count = 0;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		builder.append("<");
		while (!q.isEmpty()) {
			count++;
			int temp = q.poll();
			if (count == K) {
				builder.append(temp + ", ");
				count = 0;
			}
			else {
				q.add(temp);
			}

		}

		builder.delete(builder.length() - 2, builder.length());
		builder.append(">");
		
		bw.write(builder.toString());
		bw.flush();

	}

}

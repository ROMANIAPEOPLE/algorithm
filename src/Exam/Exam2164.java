package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Exam2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> q = new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		while(q.size() !=1) {
			q.removeFirst();
			q.addLast(q.removeFirst());
		}

		System.out.println(q.element());
		
	}
}

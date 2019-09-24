package Exam;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Exam1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ~n까지 덱에 넣을 수
		int k = sc.nextInt(); // testCase

		int count = 0;

		Deque<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();

			while (true) {
				int index = 0; // 몇번쨰 인덱스인지 찾기
				Iterator<Integer> it = q.iterator();
				while (it.hasNext()) {
					if (it.next() == num)
						break;
					index++;
				}

				if (index == 0) {
					q.pollFirst();
					break;
				}

				else if (index > q.size() / 2) {
					q.addFirst(q.removeLast());
					count++;
				}

				else {
					q.addLast(q.removeFirst());
					count++;
				}

			}

		}

		System.out.println(count);

	}

}

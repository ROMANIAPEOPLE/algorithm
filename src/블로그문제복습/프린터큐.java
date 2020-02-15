package 블로그문제복습;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair {
	int document;
	int pri;

	pair(int document, int pri) {
		this.document = document;
		this.pri = pri;
	}
}

public class 프린터큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			Queue<pair> queue = new LinkedList<>();
			int document = sc.nextInt();
			int findDocument = sc.nextInt();

			for (int i = 0; i < document; i++) {
				int pri = sc.nextInt();
				queue.add(new pair(i, pri));
			}
			int result = 1;

			while (!queue.isEmpty()) {
				pair curDocu = queue.poll();
				boolean ck = true;

				Iterator it = queue.iterator();

				while (it.hasNext()) {
					pair value = (pair) it.next();
					if (curDocu.pri < value.pri) {
						queue.add(curDocu);
						ck = false; // 인쇄불가
						break;
					}
				}
				if (ck) {
					if (curDocu.document == findDocument) {
						System.out.println(result);
					} else {
						result++;
					}

				}
			}
		}
	}

}

package programmers.stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class print {
	int pri;
	int num;

	public print(int pri, int num) {
		this.pri = pri;
		this.num = num;
	}
}

public class 프린터큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int result = 1;
			int n = sc.nextInt(); // 문서의 수
			int m = sc.nextInt(); // 현재 궁금한 문서가 queue에 몇번쨰로 있는지.
			
			Queue<print> qu = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				int priNum = sc.nextInt();
				qu.add(new print(priNum, i));
			}
	
			while (!qu.isEmpty()) {
				
				print curDocu = qu.poll();
				boolean ck = true;
				
				Iterator it = qu.iterator();
			
				while (it.hasNext()) {
					print value = (print) it.next();
					if (value.pri > curDocu.pri) {
						qu.add(curDocu);
						ck = false;
						break;
					}
				}

				if (ck) {
					if (m == curDocu.num) {
						System.out.println(result);
					} else {
						result++;
					}

				}

			}
		}

	}

}

package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Exam1966 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());// 문서의 수
			int number = Integer.parseInt(st.nextToken());

			Queue<Printer> queue = new LinkedList<Printer>();
			// 이제, 문서의 수 만큼 우선순위를 지정해줘야 한다.
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < count; j++) {

				int p = Integer.parseInt(st.nextToken());
				queue.add(new Printer(j, p)); // 큐에 문서의 순서(번호)와 우선순위를 add 해줌.
			}

			int ans = 1;

			while (!queue.isEmpty()) {
				Printer now = queue.poll();
				boolean ck = true;

				Iterator it = queue.iterator();
				while (it.hasNext()) {
					Printer value = (Printer) it.next();
					if (now.pri < value.pri) {
						ck = false;
						break; // 현재 문서(검색을 원하는 문서)보다 우선순위가 높은 것이 있다면 , 이터레이터를 종료함(뒤로 보내기 위해)
					}

				}

				if (!ck) {
					queue.add(now); // 현재 문서를 맨 뒤로 보냄

				} else { // 현재 문서가 우선순위가 1순위라면
					if (now.num == number) {
						System.out.println(ans);
					} else {
						ans++;
					}

				}

			}

		}

	}

}

class Printer {
	int num;
	int pri;

	public Printer(int num, int pri) {
		this.num = num;
		this.pri = pri;
	}

}

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
			int count = Integer.parseInt(st.nextToken());// ������ ��
			int number = Integer.parseInt(st.nextToken());

			Queue<Printer> queue = new LinkedList<Printer>();
			// ����, ������ �� ��ŭ �켱������ ��������� �Ѵ�.
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < count; j++) {

				int p = Integer.parseInt(st.nextToken());
				queue.add(new Printer(j, p)); // ť�� ������ ����(��ȣ)�� �켱������ add ����.
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
						break; // ���� ����(�˻��� ���ϴ� ����)���� �켱������ ���� ���� �ִٸ� , ���ͷ����͸� ������(�ڷ� ������ ����)
					}

				}

				if (!ck) {
					queue.add(now); // ���� ������ �� �ڷ� ����

				} else { // ���� ������ �켱������ 1�������
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

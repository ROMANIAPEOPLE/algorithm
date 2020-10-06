package 프로그래머스;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Pr {
	int num;
	int pri;

	Pr(int num, int pri) {
		this.num = num;
		this.pri = pri;
	}

}

public class 프린터기 {
	public int solution(int[] priorities, int location) {

		Queue<Pr> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			queue.offer(new Pr(i, priorities[i]));
		}

		int result = 1;

		while (!queue.isEmpty()) {
			Pr cur = queue.poll();
			boolean ck = true;
			Iterator it = queue.iterator();
			while (it.hasNext()) {
				Pr now = (Pr) it.next();
				if (cur.pri < now.pri) {
					queue.offer(cur);
					ck = false;
					break;
				}
			}

			if (ck) {
				if (cur.num == location) {
					break;
				} else {
					result++;
				}
			}

		}

		return result;
	}

}

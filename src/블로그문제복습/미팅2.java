package 블로그문제복습;


/*
 * 미팅룸2 조금 어려운 문제임.
 * 회의실이 총 몇개 필요한지 구하는 문제
 * 우선순위 큐(힙)을 이용하여, 힙 안을 회의가 끝나는 시간 오름차순으로 정렬해야함
 * 만약, 낮은차순으로 정렬하거나 일반 queue를 사용한다면 끝나는 시간이 더 느린 시간이 먼저 비교되면, 불필요한 회의실을 사용하게됨
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval2 {
	int start;
	int end;

	Interval2(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class 미팅2 {
	public static void main(String[] args) {
		Interval2 in3 = new Interval2(0, 27);
		Interval2 in1 = new Interval2(5, 32);
		Interval2 in2 = new Interval2(28, 32);
		
		Interval2[] intervals = { in1, in3,in2};

		Arrays.sort(intervals, (o1, o2) -> o1.start - o2.start);

		System.out.println(solve(intervals));

	}

	static Comparator<Interval2> comp = new Comparator<Interval2>() {
		@Override
		public int compare(Interval2 o1, Interval2 o2) {
			return o1.end - o2.end;
		}
	};

	public static int solve(Interval2[] intervals) {
		Queue<Interval2> heap = new PriorityQueue<>(intervals.length, comp);
		heap.offer(intervals[0]);

		for (int i = 1; i < intervals.length; i++) {
			Interval2 in = heap.poll();
			if (in.end <= intervals[i].start) {
				in.end = intervals[i].end;
			} else {
				heap.offer(intervals[i]);
			}

			heap.offer(in);
		}

		return heap.size();

	}

}

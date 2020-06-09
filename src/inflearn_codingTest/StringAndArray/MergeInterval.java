package inflearn_codingTest.StringAndArray;

import java.util.ArrayList;
import java.util.List;

class pair implements Comparable<pair> {
	int start;
	int end;

	pair() {
		start = 0;
		end = 0;
	}

	pair(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public int compareTo(pair o) {
		return this.start - o.start;
	}
}

public class MergeInterval {
	public static void main(String[] args) {

//		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		pair in1 = new pair(1, 3);
		pair in2 = new pair(2, 6);
		pair in3 = new pair(8, 10);
		pair in4 = new pair(15, 18);

		List<pair> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);

		List<pair> list = new ArrayList<>();

		pair before = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			pair current = intervals.get(i);
			if (before.end >= current.start) {
				before.end = Math.max(before.end, current.end);
			} else {
				list.add(before);
				before = current;

			}
		}

		if (!list.contains(before)) {
			list.add(before);
		}

		print(list);

	}

	public static void print(List<pair> list) {
		for (int i = 0; i < list.size(); i++) {
			pair p = list.get(i);
			System.out.println(p.start + "," + p.end);
		}
	}

}

package 블로그문제복습;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 미팅2 {
	public static void main(String[] args) {
		미팅2 a = new 미팅2();
		Interval in3 = new Interval(0, 27);
		Interval in1 = new Interval(5, 32);
		Interval in2 = new Interval(29, 40);
		Interval in4 = new Interval(28, 50);
		Interval in5 = new Interval(51, 65);
		Interval in6 = new Interval(63, 67);
		Interval[] intervals = { in1, in2, in3, in4, in5 ,in6};
		System.out.println(a.solve(intervals));
	}
	
	public int solve(Interval [] in) {
		
		int count = 1;
		Arrays.parallelSort(in, (o1,o2) -> o1.start - o2.start);
		Queue<Interval> q = new LinkedList<>();
		q.add(in[0]);
		for(int i=1; i<in.length; i++) {
			if(q.peek().end < in[i].start) {
				q.add(in[i]);
			}else {
				count++;
			}
		}
		
		return count;
		
		
	}
}

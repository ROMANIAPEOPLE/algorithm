package StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval3{
	int start;
	int end;

	Interval3() {
		this.start = 0;
		this.end = 0;
	}

	Interval3(int start, int end) {
		this.start = start;
		this.end = end;
	}

}
public class MeetingRoom2 {

	public static void main(String[] args) {
		Interval3 int1 = new Interval3(0, 30);
		Interval3 int3 = new Interval3(15, 20);
		Interval3 int2 = new Interval3(5, 10);
		Interval3 int5 = new Interval3(15,20);
	

		Interval3[] intervals = { int1, int3, int2,int5 };
		Arrays.sort(intervals, comp2);
		
		
		Queue<Interval3> heap = new PriorityQueue<Interval3>(intervals.length,comp3);
		
		heap.offer(intervals[0]);
		for(int i=1; i<intervals.length; i++) {
			Interval3 in = heap.poll();
			System.out.println(in.start+","+in.end);
			if(in.end > intervals[i].start) {
				heap.offer(intervals[i]);
			}
			
			heap.offer(in);
		}
		
		
		System.out.println(heap.size());		

	}
	
	static Comparator<Interval3> comp3 = new Comparator<Interval3>() {
		@Override
		public int compare(Interval3 o1, Interval3 o2) {
			return o1.end-o2.end;
		}
	};
	
	
	static Comparator<Interval3> comp2 = new Comparator<Interval3>() {
		@Override
		public int compare(Interval3 o1, Interval3 o2) {
			return o1.start-o2.start;
		}
	};
	
	
	public static void print(Interval3[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval3 in = intervals[i];
			System.out.println(in.start + " " + in.end);
		}
	}

}

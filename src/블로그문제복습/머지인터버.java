//package 블로그문제복습;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
////1,3 / 2,6 /  8,10 / 15,18
//
//class Interval implements Comparable<Interval> {
//
//	int start;
//	int end;
//
//	Interval(int start, int end){
//		this.start=start;
//		this.end = end;
//	}
//	
//	
//	@Override
//	public int compareTo(Interval o1) {
//		// TODO Auto-generated method stub
//		return this.start- o1.start;
//	}
//	
//}
//public class 머지인터버 {
//
//	public static void main(String[] args) {
//	Interval in1 = new Interval(1,3);
//	Interval in2 = new Interval(2,6);
//	Interval in3 = new Interval(8,10);
//	Interval in4 = new Interval(15,18);
//	
//	Interval [] in = {in1,in2,in3,in4};
//	
//	
//	Arrays.parallelSort(in);
//	solve(in);
//	
//	}
//	
//	
//	public static void solve(Interval [] in) {
//		Interval before = in[0];
//		
//		ArrayList<Interval> list = new ArrayList<>();
//		for(int i=1; i<in.length; i++) {
//			Interval current = in[i];
//			if(before.end >= current.start) {
//				before.end = Math.max(before.end, current.end);
//			}
//			else {
//				list.add(before);
//				before = current;
//				
//			}
//		}
//		
//		if(!list.contains(before)) {
//			list.add(before);
//		}
//		print(list);
//		
//	}
//	
//	public static void print(List<Interval> list) {
//		for (int i = 0; i < list.size(); i++) {
//			Interval p = list.get(i);
//			System.out.println(p.start + "," + p.end);
//		}
//	}
//}
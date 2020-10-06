//package ���α׷��ӽ�;
//
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class TooHOT {
//
//	public static void main(String[] args) {
//
//		int[] scoville = { 1, 2, 3, 9, 10, 12 };
//		int K = 7;
//
//		System.out.println(solution(scoville, K));
//	}
//
//	public static int solution(int[] scoville, int K) {
//		int answer = 0;
//
//		Queue<Integer> heap = new PriorityQueue<>();
//
//		for (int s : scoville) {
//			heap.offer(s); // ���� ��� ������ �־���.
//		}
//
//
//
//		while (heap.peek() <= K) {
//			if(heap.size()==1)  {
//				return -1;
//			}
//
//			int a = heap.poll();
//			int b = heap.poll();
//
//			int sum = a + (b * 2);
//			heap.offer(sum);
//			answer++;
//		}
//		return answer;
//	}
//
//}

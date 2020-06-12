package inflearn_codingTest.StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//(0,0)과 가장 가까운 K개의 좌표를 출력하라.

public class KClosestPoints {

	
	static int[][] point = {{1,3},{-2,2}};
	static int K = 1;
	
	public static void main(String[] args) {
		
		KClosestPoints a = new KClosestPoints();
		
		a.solve(point);
	}
	
	public void solve(int [][] point) {
		
		Queue<int[]> queue = new PriorityQueue<>(point.length, Comp);

		for(int [] p : point) {
			queue.add(p);
		}
		
		int [][] res = new int[K][2];
		
		for(int i=0; i<K; i++) {
			res[i] = queue.poll();
		}

		
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}

		
		
	}
	Comparator<int[]> Comp = new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return (o1[0]*o1[0] +o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]);
		}
		
	};
}

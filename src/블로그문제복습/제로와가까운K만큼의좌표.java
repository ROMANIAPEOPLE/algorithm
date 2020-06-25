package 블로그문제복습;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// input : [1,3] , [-2,2]
// output : [-2,2]
public class 제로와가까운K만큼의좌표 {

	static Comparator<int[]> comp = new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {

			return (o1[0]*o1[0] + o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1] * o2[1]);
		}
		
	};
	
	
	public static void main(String[] args) {
		
		int [][] point = {{1,3} , {-2,2}};
		int k=1;
		
		int [][] res = new int[k][2];
		
		Queue<int[]> heap = new PriorityQueue<>(point.length, comp);
		
		for(int [] p : point) {
			heap.add(p);
		}
		
		
		for(int i=0; i<k; i++) {
			res[i]=heap.poll();
		}
		
		

		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.println(res[i][j]);
			}
		}
		
		
		
		
		
		
		
	}
	
}

package StringAndArray;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementinanArray {

	public static void main(String [] args) {
		int [] nums={3,2,1,5,6,4};
		int k=2;
		Queue<Integer> heap = new PriorityQueue<Integer>((o1,o2) -> o1-o2);
		
		for(int i=0; i<nums.length; i++) {
			heap.offer(nums[i]);
		}

		for(int i=0; i<nums.length-k-1; i++) {
			heap.poll();
		}
		
		System.out.println(heap.poll());
		
	}
}

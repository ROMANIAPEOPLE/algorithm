package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < progresses.length; i++) {
			q.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: (100 - progresses[i]) / speeds[i] + 1);
		}
		
		int firstProgress = q.poll();
		int count = 1;
		
		while(!q.isEmpty()) {
			int nextProgress = q.poll();
			if(firstProgress >= nextProgress) {
				count++;
			}
			else {
				list.add(count);
				count =1;
				firstProgress = nextProgress;
			}
		}
		
		list.add(count);
		
		int [] result = new int[list.size()];
		for(int i=0; i<result.length; i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
}

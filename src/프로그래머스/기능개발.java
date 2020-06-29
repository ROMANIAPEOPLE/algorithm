package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<progresses.length; i++) {
			if(100 - progresses[i] % speeds[i] == 0 ? queue.offer(100-progresses[i] / speeds[i]) :
				queue.offer(100-progresses[i] / speeds[i]+1));
		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		int count =1;
		int first = queue.poll();
		
		while(!queue.isEmpty()) {
			int second = queue.poll();
			if(first  >= second) {
				count++;
			}
			else {
				list.add(count);
				count = 1;
				first = second;
			}
		}
		list.add(count);
		
		int [] res = new int[list.size()];
		for(int i=0; i<res.length; i++) {
			res[i] = list.get(i);
		}
		
		return res;
	}
	
}

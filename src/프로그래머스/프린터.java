package 프로그래머스;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class printer {
	int docuNum;
	int pri;

	public printer(int docuNum, int pri) {
		this.docuNum = docuNum;
		this.pri = pri;
	}
}

public class 프린터 {
	public int solution(int[] priorities, int location) {
		int answer = 1;
		
		Queue<printer> queue = new LinkedList<>();
		
		for(int i=0; i<priorities.length; i++) {
			queue.offer(new printer(i,priorities[i]));
		}
		
		while(!queue.isEmpty()) {
			printer curDocu = queue.poll();
			boolean ck = true;
			Iterator it = queue.iterator();
			while(it.hasNext()) {
				printer value = (printer) it.next();
				
				if(value.pri > curDocu.pri) {
					ck = false;
					queue.offer(curDocu);
					break;
				}
			}
			
			if(ck) {
				if(curDocu.docuNum == location) {
					break;
				}else {
					answer++;
				}
			}
			
		}
		
		
		return answer;

	}

}

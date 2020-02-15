package programmers.stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class printer{
	int documentNumber;
	int pri;
	
	printer(int documentNumber, int pri){
		this.documentNumber = documentNumber;
		this.pri = pri;
	}
}



public class «¡∏∞≈Õ {
	public int solution(int[] priorities, int location) {
		
		Queue<printer> queue = new LinkedList<>();
		
		int result =1;
		
		
		for(int i=0; i<priorities.length; i++) {
			queue.add(new printer(i,priorities[i]));
		}
		
		while(!queue.isEmpty()) {
			printer curDocu = queue.poll();
			boolean ck = true;
			Iterator it = queue.iterator();
			while(it.hasNext()) {
				printer value =(printer) it.next();
				
				if(value.pri > curDocu.pri) {
					queue.add(curDocu);
					ck = false;
					break;
				}
			}
			
			if(ck) {
				if(curDocu.documentNumber == location) {
					break;
				}else {
					result++;
				}
			}
			
		}
			return result;
		
	}

}

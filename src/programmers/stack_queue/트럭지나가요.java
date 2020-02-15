package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 트럭지나가요 {
	class Truck {
		int weight;
		int distance;

		public Truck(int weight, int distance) {
			this.weight = weight;
			this.distance = distance;
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int weigthLeft = weight;
		int time = 0;

		Queue<Truck> outList = new LinkedList<Truck>();
		List<Truck> inList = new ArrayList<Truck>();

		for (int value : truck_weights) {
			outList.add(new Truck(value, bridge_length));
		}

		while (!(outList.isEmpty() && inList.isEmpty())) {
			time++;


			if (!inList.isEmpty() && inList.get(0).distance == 0) {
				weigthLeft += inList.get(0).weight;
				inList.remove(0);
			}

			if (!outList.isEmpty() && outList.peek().weight <= weigthLeft) {
				weigthLeft -= outList.peek().weight;
				inList.add(outList.poll());
			}
			
			for (int i = 0; i < inList.size(); i++) {
				inList.get(i).distance--;
			}

		}

		return time;

	}

}

/*풀이방법
 * outList에 queue로 순서대로 트럭들을 박는다. outList는 대기중인 트럭 목록이다.
 * while문으로 outList와 inList가 둘다 비어있지 않을때 까지 돌린다.
 * inList는 현재 다리위에있는, 즉 다리를 지나고있는 트럭이다.
 * inList가 비어있지 않고(다리를 지나고 있는 또는 지난 트럭이 있을 경우) , 그 트럭이다리를 모두 지났을 경우(distance==0)
 * weigthLeft(가용 가능 무게) 에  inList.get(0).weigth 인 현재 지나고있는 트럭의 무게만큼 + 해준다.
 * 그 후 , inList에서 제거한다.
 * 
 * outList가 비어있지 않고, outList의 peek부분 즉 첫번째 트럭이 가용가능한 무게보다 가볍다면, 
 * 트럭을 출발시킨다는 의미로 가용가능무게에서 트럭의 무게만큼 빼준다. 또 출발한 트럭을 inList(다리위를 건너고있는 트럭)에 넣어준다.
 * 
 * while문이 한번 돌때마다 1초(time++)가 흐르기 때문에 다리를 건너는 트럭의 distance를 1씩 -- 해준다.
 * 
 */

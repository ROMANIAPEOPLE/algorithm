package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class T {
	int truckWeight;
	int length;

	public T(int truckWeight, int length) {
		this.truckWeight = truckWeight;
		this.length = length;
	}
}

public class 다_트_지 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {

		Queue<T> outTruck = new LinkedList<>();
		List<T> inTruck = new ArrayList<>();

		for (int i = 0; i < truck_weights.length; i++) {
			outTruck.offer(new T(truck_weights[i], bridge_length));
		}
		int time = 0;
		int left = weight;
		while (!outTruck.isEmpty() && !inTruck.isEmpty()) {
			time++;

			if (!inTruck.isEmpty() && inTruck.get(0).length == 0) {
				left += inTruck.get(0).truckWeight;
				inTruck.remove(0);
			}

			if (!outTruck.isEmpty() && outTruck.peek().truckWeight <= left) {
				left -= outTruck.peek().truckWeight;
				inTruck.add(outTruck.poll());
			}

			for (int i = 0; i < inTruck.size(); i++) {
				inTruck.get(i).length--;
			}

		}

		return time;
	}
}
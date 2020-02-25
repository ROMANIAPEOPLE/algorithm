package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class truck {
	int weigth;
	int brigeLength;

	truck(int weigth, int brigeLength) {
		this.weigth = weigth;
		this.brigeLength = brigeLength;
	}
}

public class 트럭쿠 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 트럭의 수
		int w = sc.nextInt(); // 브릿지의 길이
		int L = sc.nextInt(); // 다리가 수용 가능한 무게

		int[] truckWeight = new int[n];

		int west = L;

		for (int i = 0; i < n; i++) {
			truckWeight[i] = sc.nextInt();
		}

		Queue<truck> outList = new LinkedList<>();
		List<truck> inList = new ArrayList<>();

		for (int value : truckWeight) {
			outList.add(new truck(value, w));
		}

		int time = 0;

		while (!(outList.isEmpty() && inList.isEmpty())) {
			time++;

			if (!inList.isEmpty() && inList.get(0).brigeLength == 0) {
				west += inList.get(0).weigth;
				inList.remove(0);
			}

			if (!outList.isEmpty() && outList.peek().weigth <= west) {
				west -= outList.peek().weigth;
				inList.add(outList.poll());
			}

			for (int i = 0; i < inList.size(); i++) {
				inList.get(i).brigeLength--;
			}

		}

		System.out.println(time);
	}

}

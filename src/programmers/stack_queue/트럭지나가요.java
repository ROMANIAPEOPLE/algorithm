package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ʈ���������� {
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

/*Ǯ�̹��
 * outList�� queue�� ������� Ʈ������ �ڴ´�. outList�� ������� Ʈ�� ����̴�.
 * while������ outList�� inList�� �Ѵ� ������� ������ ���� ������.
 * inList�� ���� �ٸ������ִ�, �� �ٸ��� �������ִ� Ʈ���̴�.
 * inList�� ������� �ʰ�(�ٸ��� ������ �ִ� �Ǵ� ���� Ʈ���� ���� ���) , �� Ʈ���̴ٸ��� ��� ������ ���(distance==0)
 * weigthLeft(���� ���� ����) ��  inList.get(0).weigth �� ���� �������ִ� Ʈ���� ���Ը�ŭ + ���ش�.
 * �� �� , inList���� �����Ѵ�.
 * 
 * outList�� ������� �ʰ�, outList�� peek�κ� �� ù��° Ʈ���� ���밡���� ���Ժ��� �����ٸ�, 
 * Ʈ���� ��߽�Ų�ٴ� �ǹ̷� ���밡�ɹ��Կ��� Ʈ���� ���Ը�ŭ ���ش�. �� ����� Ʈ���� inList(�ٸ����� �ǳʰ��ִ� Ʈ��)�� �־��ش�.
 * 
 * while���� �ѹ� �������� 1��(time++)�� �帣�� ������ �ٸ��� �ǳʴ� Ʈ���� distance�� 1�� -- ���ش�.
 * 
 */

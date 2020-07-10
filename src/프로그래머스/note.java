package ���α׷��ӽ�;

import java.util.*;

//A  : 65  a : 97
public class note {

	public static void main(String[] args) {

		int[] s = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int n = 5;
		System.out.println(solution(n, s));
	}

	public static int[] solution(int n, int[] stages) {
		int[] answer = new int[n];
		int count = stages.length; // ���������� ������ �÷��̾� ��
		double[] fail = new double[n];
		Map<Integer, Double> map = new HashMap<>();
		int stageCnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					stageCnt++; // �� �ܰ��� ���������� ++
				}
			}
			fail[i - 1] = (double) (stageCnt / count);
			map.put(i, fail[i - 1]); // key���� index , value�� ������(�ߺ�)
			count -= stageCnt; // ���� ���������� ���ְ�,
			stageCnt = 0; // �������� ī���ʹ� �ٽ� 0����
		}

		Arrays.sort(fail); // �������� ���������� ����Ǿ�����.

		for (int i = 0; i < fail.length / 2; i++) {
			// swap the elements
			double temp = fail[i];
			fail[i] = fail[fail.length - (i + 1)];
			fail[fail.length - (i + 1)] = temp;
		}

		for (int i = 0; i < fail.length; i++) {
			for (int j = 0; j < map.size(); j++) {
				if (fail[i] == map.get(j)) {
					answer[i] = j;
				}
			}
		}

		return answer;
	}
} // 1 2 3 4 5 �� ������� �������� ������ �Ǿ�����.
	// ���� �� ���������� �˾ƾ��ϴµ�. map�� �������� key������ ������ ���� ����.
	// 2�� �ε����� ������
	// for���� map�� �����ŭ ���鼭,
	// fail[i] �� ���� map.get(j)�� ��ġ�Ѵٸ� ?
	// answer�� j�� �־��ָ� �ǳ�..

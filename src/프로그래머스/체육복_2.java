package ���α׷��ӽ�;

import java.util.HashSet;
import java.util.Set;

public class ü����_2 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Set<Integer> set = new HashSet<>();
		for (int r : reserve) {
			set.add(r);
		}

		// ������ �����Դµ�, ���ϸ��� �л�
		for (int i = 0; i < lost.length; i++) {
			if (set.contains(lost[i])) {
				answer++;
				set.remove(lost[i]);
				lost[i] = -1; // �Ⱥ����� �ȴٴ� ������, ���Ƿ� -1�� ����
			}
		}

		for (int i = 0; i < lost.length; i++) {
			if (set.contains(lost[i] - 1)) {
				answer++;
				set.remove(lost[i] - 1);
				lost[i] = -1;
				continue;
			}

			else if (set.contains(lost[i] + 1)) {
				answer++;
				set.remove(lost[i ]+1);
				lost[i] = -1;
				continue;
			}

		}

		return answer;
	}
}
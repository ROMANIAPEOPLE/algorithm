package ��α׹�������;

import java.util.HashSet;
import java.util.Set;

//ü������ �� ���� ���� �� �������?
public class ü���� {
	public int solution(int n, int[] lost, int[] reserve) {
		int res = n - lost.length;
		// ��ü �л��� �� - �Ҿ���� �л��Ǽ� = ü������ �������ִ� �л��� ��.
		// ���⼭, lost���� �ְ�, reserve���� �ִ� �л��� ��Ͽ��� �����ؾ���.

		Set<Integer> set = new HashSet<>();

		for (int r : reserve) {
			set.add(r);
		}

		
		for(int i=0; i<lost.length; i++) {
			if(set.contains(lost[i])) {
				set.remove(lost[i]);
				lost[i]=-1;
				res++;
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			if (set.contains(lost[i] - 1)) {
				set.remove(lost[i] - 1);
				lost[i] = -1;
				res++;
				continue;
			}

			if (set.contains(lost[i] + 1)) {
				set.remove(lost[i] + 1);
				lost[i] = -1;
				res++;
				continue;
			}
		}
		return res;
	}
}

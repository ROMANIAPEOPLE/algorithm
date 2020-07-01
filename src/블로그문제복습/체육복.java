package 블로그문제복습;

import java.util.HashSet;
import java.util.Set;

//체육복은 몇 명이 입을 수 있을까요?
public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int res = n - lost.length;
		// 전체 학생의 수 - 잃어버린 학생의수 = 체육복을 가지고있는 학생의 수.
		// 여기서, lost에도 있고, reserve에도 있는 학생을 목록에서 제거해야함.

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

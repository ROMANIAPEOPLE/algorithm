package 프로그래머스;

import java.util.HashSet;
import java.util.Set;

public class 체육복_2 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Set<Integer> set = new HashSet<>();
		for (int r : reserve) {
			set.add(r);
		}

		// 여분을 가져왔는데, 도둑맞은 학생
		for (int i = 0; i < lost.length; i++) {
			if (set.contains(lost[i])) {
				answer++;
				set.remove(lost[i]);
				lost[i] = -1; // 안빌려도 된다는 뜻으로, 임의로 -1로 설정
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
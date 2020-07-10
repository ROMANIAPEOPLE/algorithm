package 프로그래머스;

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
		int count = stages.length; // 스테이지에 도달한 플레이어 수
		double[] fail = new double[n];
		Map<Integer, Double> map = new HashMap<>();
		int stageCnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					stageCnt++; // 그 단계의 스테이지를 ++
				}
			}
			fail[i - 1] = (double) (stageCnt / count);
			map.put(i, fail[i - 1]); // key값이 index , value가 실패율(중복)
			count -= stageCnt; // 이전 스테이지는 뺴주고,
			stageCnt = 0; // 스테이지 카운터는 다시 0으로
		}

		Arrays.sort(fail); // 실패율이 낮은순으로 저장되어있음.

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
} // 1 2 3 4 5 번 순서대로 실패율이 저장이 되어있음.
	// 뭐가 뭐 실패율인지 알아야하는데. map에 실패율을 key값으로 저장할 수는 없음.
	// 2번 인덱스의 실패율
	// for문을 map의 사이즈만큼 돌면서,
	// fail[i] 의 값과 map.get(j)이 일치한다면 ?
	// answer에 j를 넣어주면 되나..

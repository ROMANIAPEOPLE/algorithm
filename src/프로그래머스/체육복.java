package 프로그래머스;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {

		int answer = n - lost.length; // 전체 학생수 n 에서 체육복을 잃어버린 사람 lost의 길이만큼 빼준다.

		// 1. 체육복을 잃어버렸으면서, 여분의 체육복을 가져온 학생 (즉, 아무것도 아닌사람이 된다.)
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(reserve[j]-1 ==lost[i] || reserve[j]+1 == lost[i]) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}

		return answer;
	}
}

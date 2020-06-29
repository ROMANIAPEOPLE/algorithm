package ���α׷��ӽ�;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ü���� {
	public int solution(int n, int[] lost, int[] reserve) {

		int answer = n - lost.length; // ��ü �л��� n ���� ü������ �Ҿ���� ��� lost�� ���̸�ŭ ���ش�.

		// 1. ü������ �Ҿ�������鼭, ������ ü������ ������ �л� (��, �ƹ��͵� �ƴѻ���� �ȴ�.)
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

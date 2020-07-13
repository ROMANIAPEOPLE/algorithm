package ���α׷��ӽ�;

public class ��Ʈ���� {
	
	public static void main(String [] args) {
		System.out.println(solution("1D2S#10S"));
	}
	
	public static int solution(String dartResult) {
		char[] c = dartResult.toCharArray();
		// 1,D,2,S,$,1,0,S
		// S,D,T , # , *

		// ���ھ� ���ϴ°� ����, ������ ����
		int[] score = new int[3];
		
		int cnt=-1;
		
		for(int i=0; i<c.length; i++) {
			if(c[i] >= '0' && c[i] <='9') {
				cnt++;
				if(c[i] == '1' && c[i+1] == '0') {
					score[cnt] = 10;
					i++;
				}
				else {
					score[cnt] = c[i]-'0';
				}
			}else if(c[i] == 'D') {
				score[cnt] *=score[cnt];
			}
			else if(c[i] == 'T') {
				score[cnt] *=score[cnt]*score[cnt];
			}
			else if(c[i] == '*') {
				if(cnt>0) {
					score[cnt-1] *=2;
				}
				score[cnt] *=2;
			}
			
			else if(c[i] == '#') {
				score[cnt] *= -1;
			}
			
		}
		
		
		return score[0]+score[1]+score[2];
	}
}

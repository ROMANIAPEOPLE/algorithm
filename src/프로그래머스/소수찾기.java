//package ���α׷��ӽ�;
//
//public class �Ҽ�ã�� {
//
//	public static void main(String[] args) {
//
//		System.out.println(solution(20));
//		// 4��
//
//	}
//
//	public static int solution(int n) {
//		int answer = 0;
//
//		boolean[] temp = new boolean[n+1]; // false
//		// �Ҽ��� false
//		temp[0] = true;
//		temp[1] = true;
//
//		for (int i = 2; i < temp.length; i++) {
//			if (!temp[i]) {
//				for (int j = i * 2; j < temp.length; j += i) {
//					temp[j] = true;
//				}
//			}
//		}
//
//		for (boolean t : temp) {
//			if (!t) {
//				answer++;
//			}
//
//		}
//
//		return answer;
//	}
//}
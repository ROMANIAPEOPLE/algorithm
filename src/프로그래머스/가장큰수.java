//package ���α׷��ӽ�;
//
//
//public class ����ū�� {
//
//	public String solution(String number, int k) {
//
//		StringBuilder bd = new StringBuilder();
//		int max = 0;
//		int index =0;
//		int size = number.length()-k;
//		for(int i=0; i<number.length()-k; i++) { // K��ŭ ���� ���̸� ���ؾ���
//			for(int j=index; j+size <=number.length(); j++ ) {
//				int num = number.charAt(j)-'0';
//				if(max< num) {
//					max  = num;
//					index = j+1;
//				}
//			}
//
//
//			bd.append(max);
//			max = 0;
//			size--;
//		}
//
//		return bd.toString();
//
//	}
//}

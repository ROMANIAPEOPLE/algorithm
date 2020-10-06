//package ���α׷��ӽ�;
//
//
//public class ������� {
//
//	public static void main(String[] args) {
//		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
//		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
//		int n = 6;
//	}
//
//	public static String[] solution(int n, int[] arr1, int[] arr2) {
//		String[] answer = new String[arr1.length];
//		String[] twoJinsu1 = getTwo(arr1, n);
//		String[] twoJinsu2 = getTwo(arr2, n);
//		String temp = "";
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (((twoJinsu1[i].substring(j, j + 1)) + (twoJinsu2[i].substring(j, j + 1))).equals("11")) {
//					temp += "#";
//				} else if (((twoJinsu1[i].substring(j, j + 1)) + (twoJinsu2[i].substring(j, j + 1))).equals("10")
//						|| ((twoJinsu1[i].substring(j, j + 1)) + (twoJinsu2[i].substring(j, j + 1))).equals("01")) {
//					temp += "#";
//				} else {
//					temp += " ";
//				}
//			}
//			answer[i] = temp;
//			temp = "";
//		}
//
//		return answer;
//	}
//	public static String[] getTwo(int[] arr, int n) {
//		String[] twoJinsu = new String[arr.length];
//		String temp = "";
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < n; j++) {
//				int numTemp = arr[i] % 2;
//				temp += String.valueOf(numTemp);
//				arr[i] = arr[i] / 2;
//			}
//			StringBuilder bd = new StringBuilder(temp);
//			bd.reverse();
//			twoJinsu[i] = bd.toString();
//			temp = "";
//		}
//		return twoJinsu;
//	}
//}
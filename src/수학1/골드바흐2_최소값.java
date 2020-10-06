//package ����1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ������2_�ּҰ� {
//	static boolean[] check = new boolean[10001];
//
//	public static void build_Prime() {
//		for (int i = 2; i <= 10000; i++) {
//			if (check[i]) {
//				for (int j = i * 2; j <= 10000; j += i) {
//					check[j] = false; // �Ҽ��� true, �ƴϸ� false
//				}
//			}
//		}
//	}
//
//
//	public static void main(String[] args) {
//		Arrays.fill(check, true);
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		build_Prime();
//		while(T-- > 0) {
//			int n =sc.nextInt();
//			n/=2;
//			int dif=0;
//			while(true) {
//				if(check[n-dif] && check[n+dif]) {
//					System.out.print((n-dif) + " " + (n+dif));
//					System.out.println();
//					break;
//				}
//				dif++;
//			}
//		}
//	}
//}
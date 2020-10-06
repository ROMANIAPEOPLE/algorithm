//package algorithm_Study;
//
//import java.util.Scanner;
//
//public class �Ѽ� {
//
//	public static void hansu(int n) {
//		if (n < 100)
//			System.out.println(n);
//
//		else {
//			int result = 99;
//
//			for (int i = 100; i <= n; i++) {
//				int a = i / 100; // 100���ڸ� ���ϱ�
//				int b = (i % 100) / 10; // 10���ڸ�
//				int c = i % 10; // 1�� �ڸ�
//
//				if ((b - a) == (c - b)) {
//					result++;
//				}
//
//			}
//
//			System.out.println(result);
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		hansu(n);
//
//	}
//
//}

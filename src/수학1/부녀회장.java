package 수학1;

import java.util.Scanner;

public class 부녀회장 {

	public static int recursive(int k, int n) {

		if (n == 0) {
			return 0;
		} else if (k == 0) {
			return n;
		}
		return recursive(k, n - 1) + recursive(k - 1, n);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int k = sc.nextInt();// 2
			int n = sc.nextInt();// 3

			System.out.println(recursive(k, n));

		}

	}

}

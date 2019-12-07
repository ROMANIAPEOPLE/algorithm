package algorithm_Study;

import java.util.Arrays;
import java.util.Scanner;

public class ��ȣ�ͱ۱� {

	static boolean check(String password) {
		int v = 0; // ����
		int c = 0; // ����

		for (char arr : password.toCharArray()) {
			if (arr == 'a' || arr == 'e' || arr == 'i' || arr == 'o' || arr == 'u') {
				v++;
			} else {
				c++;
			}
		}

		return v >= 1 && c >= 2;

	}

	static void go(String[] alpha, int index, String password, int L) {

		if (password.length() == L) {
			if(check(password)) {
				System.out.println(password);
			}
			return;
		}

		if (index >= alpha.length) {
			return;
		}

		go(alpha, index + 1, password + alpha[index], L);
		go(alpha, index + 1, password, L);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt(); // ��ȣ�� ����
		int C = sc.nextInt(); // �־��� ���ĺ��� ����

		String[] alpha = new String[C];

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = sc.next();
		}
		Arrays.parallelSort(alpha);

		go(alpha, 0, "", L);

	}

}

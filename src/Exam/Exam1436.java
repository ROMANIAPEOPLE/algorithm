package Exam;

import java.util.Scanner;

public class Exam1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ���° ��ȭ����?
		int number = 0;

		while (N > 0) {
			number++;
			String s = Integer.toString(number);

			if (s.contains("666")) {
				N--;
			}
		}

		System.out.println(number);

	}

}

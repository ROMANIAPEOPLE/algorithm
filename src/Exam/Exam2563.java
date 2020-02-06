package Exam;

import java.util.Scanner;

public class Exam2563 {

	static boolean[][] map = new boolean[100][100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int count = 0;

		for (int i = 0; i < tc; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int k = a; k < a + 10; k++) {
				for (int z = b; z < b + 10; z++) {
					if (map[k][z]) {
						continue;
					}

					map[k][z] = true;
					count++;
				}

			}

		}
		System.out.println(count);
	}

}

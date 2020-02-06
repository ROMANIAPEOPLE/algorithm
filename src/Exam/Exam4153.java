package Exam;

import java.util.Scanner;

public class Exam4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			int Ausar = sc.nextInt();
			int Auset = sc.nextInt();
			int Heru = sc.nextInt();

			if (Heru == 0 && Ausar == 0 && Auset == 0) {
				break;
			}

			if ((long) Math.pow(Heru, 2) == (long) Math.pow(Ausar, 2) + (long) Math.pow(Auset, 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}
	}
}

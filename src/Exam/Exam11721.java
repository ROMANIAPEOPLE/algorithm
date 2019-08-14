package Exam;

import java.util.Scanner;

//1. 문제
//주어진 단어를 한 줄에 10문자씩 출력


public class Exam11721 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}
		}

	}

}

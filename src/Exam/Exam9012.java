package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int num = sc.nextInt();
		String st = sc.nextLine();
		for (int i = 0; i < num; i++) {
			list.add(st);
		}
		sc.close();

		for (String s : list) {
			if (isVPS(s) == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	public static boolean isVPS(String str) {
		char[] charArr = str.toCharArray();
		int cnt = 0;
		for (Character character : charArr) {
			if (character == '(')
				cnt = cnt + 1;
			else {	
				if (cnt == 0)
					return false;
				else
					cnt = cnt - 1;
			}
		}
		if (cnt == 0)
			return true;
		else
			return false;
	}
}

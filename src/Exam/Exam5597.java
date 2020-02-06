package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 1; i <= 30; i++) {
			list.add(i);
		}

		for (int i = 0; i < 28; i++) {
			list2.add(sc.nextInt());
		}

		list.removeAll(list2);
		for (int v : list) {
			System.out.println(v);
		}

	}
}

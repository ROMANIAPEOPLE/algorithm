package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2959 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] a = new int[4];

		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.parallelSort(a);


		System.out.println(a[0] * a[2]);




	}

}

package Exam;

import java.util.Scanner;

public class Exam10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<value) {
				System.out.print(array[i] + " ");
			}
		}

	}

}

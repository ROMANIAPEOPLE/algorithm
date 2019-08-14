package Exam;

import java.util.Arrays;
import java.util.Random;

public class Exam2490 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[][] array = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = ran.nextInt(2);
			}
		}

		int one = 0;

		for (int i = 0; i < 3; i++) {
			one = 0;

			for (int j = 0; j < 4; j++) {
				if (array[i][j] == 1) {
					one++;
				}
			}
		
			if(one==0) {
				System.out.println("D");
			}
			else if(one ==1) {
				System.out.println("C");
			}
			
			else if(one ==2) {
				System.out.println("B");
			}
			else if(one ==3) {
				System.out.println("A");
			}
			
			else if(one ==4) {
				System.out.println("E");
			}
			
			
		}

	}

}

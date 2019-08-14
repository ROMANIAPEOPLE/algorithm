package Exam;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int[] month = new int[13];
		month[1] = month[3] = month[5] = month[7] = month[8] = month[10] = month[12] = 31;
		month[4] = month[6] = month[9] = month[11] = 30;
		month[2] = 28;

		int sum = 0;
		for (int i = 1; i <= 12; i++) {
			if (i == m) {
				break;
			}
			sum += month[i];
		}
		sum = sum + d;

		switch(sum%7) {
		case 0 :
			System.out.println("SUN");
			break;
		case 1 :
			System.out.println("MON");
			break;
		case 2 :
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}

}

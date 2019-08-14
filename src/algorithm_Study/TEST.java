package algorithm_Study;

import java.util.Scanner;



public class TEST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int number;
		number=n;
		// ex 26
		while (true) {
			int ten = number / 10; // 10의자리 2
			int one = number % 10; // 1의자리 6
			int sum = (ten + one)%10; // 8을 구함
			int result = (one * 10) + sum;
			count++;

			if (result == number) {
				break;
			}
		}
		
		System.out.println(count);

	}

}

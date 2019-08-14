//소수구하기2

package Exam;

import java.util.Scanner;

public class Exam2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int min=10001;
		int result=0;
		int count=0;
		for(int i = num1; i<=num2; i++) {
			count =0;
			for(int j=1; j<=i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			if(count ==2) {
				result +=i;
				if(min>i) {
					min=i;
				}
			}
		}
		
		if(min == 10001) {
			System.out.println("-1");
		}
		
		else 
			System.out.println(result );
			System.out.println(min);

	}

}

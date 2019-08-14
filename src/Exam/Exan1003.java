package Exam;

import java.util.Scanner;

public class Exan1003 {

	static int [] temp = new int[2];
	
	static int fibonacci(int n) {
		if(n==0) {
			temp[0]++;
			return 0;
		}
		else if(n==1) {
			temp[1]++;
			return 1;
		}
		
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i=0; i<num; i++) {
			int num2 = sc.nextInt();
			temp[0] =0;
			temp[1] =0;
			
			fibonacci(num2);
			System.out.println(temp[0] + " " + temp[1]);
		}
		
		
		
	}

}

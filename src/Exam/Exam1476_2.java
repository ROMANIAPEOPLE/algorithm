package Exam;

import java.util.Scanner;

public class Exam1476_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int E=sc.nextInt();
		int S=sc.nextInt();
		int M=sc.nextInt();
		
		E-=1;
		S-=1;
		M-=1;
		
		for(int i=0;; i++) {
			if(i%15==E && i%28 == S && i%19 ==M) {
				System.out.println(i+1);
				break;
			}
		}
	}
}

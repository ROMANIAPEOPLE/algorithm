package Exam;

import java.util.Scanner;

public class Exam1476_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int e=1;
		int s=1;
		int m=1;
		
		for(int i=1;; i++) {
			if(E==e && S ==s && M==m) {
				System.out.println(i);
				break;
			}
			
			e++;
			s++;
			m++;
			
			if(e==16) e=1;
			if(s==29) s=1;
			if(m==20) m=1;
		}
	}
}
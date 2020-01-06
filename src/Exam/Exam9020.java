package Exam;

import java.util.Scanner;

public class Exam9020 {

	
	public static boolean [] ck = new boolean[1000001];
	
	public static void prime() {
		
		for(int i=2; i<=1000000; i++) {
			if(!ck[i]) {
				for(int j=i*2; j<=1000000; j+=i) {
					ck[j] = true; //소수가 아니면 트루
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		prime();
		boolean check = false;
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
		
			for(int i=2; i<=n/2; i++) { //숫자의 제곱근 까지마 약수를 계산
				
				if(!ck[i] && !ck[n-i]) {
					System.out.print(n + " = " + (i) + " + " + (n-i));
					System.out.println();
					check = true;
					break;
				}
				
			}
			
			if(!check) {
                System.out.println("Goldbach's conjecture is wrong.");
			}
		}
		
	}
	
}

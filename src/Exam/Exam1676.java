package Exam;

import java.util.Scanner;

public class Exam1676 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		
		if(n <25) {
			ans += n/5;
		}
		else if(n <125) {
			ans += n/5;
			ans += n/25;
		}
		else {
			 ans +=n/5;
			ans += n/25;
			ans += n/125;
		}
		
		System.out.println(ans);
		
	}
}

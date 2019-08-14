//소수 구하기
package Exam;

import java.util.Scanner;

public class Exam1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int primeCount= 0;
		int cnt = 0;
		
		for(int i=0; i<num; i++){
			
			int num2 = sc.nextInt();
			cnt=0;
			for(int j=1; j<=num2; j++) {
				if(num2 % j == 0) {
					cnt++;
				}
			}
			
			if(cnt ==2) {
				primeCount++;
			}
			
		}
		
		System.out.println(primeCount);
		
		
	}

}

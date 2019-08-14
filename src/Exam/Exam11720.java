package Exam;

import java.util.Scanner;

public class Exam11720 {
// n개의 정수를 입력받아 , 그 정수를 모두 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum+=Integer.parseInt(input.substring(i, i+1)); //String을 int형으로
		}
		System.out.println(sum);
		
	}

}

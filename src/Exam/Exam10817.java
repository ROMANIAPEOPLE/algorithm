package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10817 {
//두번째 요소 출력하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] temp = new int[3];
		for(int i=0; i<temp.length; i++) {
			temp[i] = sc.nextInt();
		}
		
		Arrays.sort(temp);
		
		System.out.println(temp[1]);
		
	}

}

package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2747 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int [] temp = new int[num+1];
		
		temp[0] =0;
		temp[1] =1;
		
		for(int i=1; i<temp.length-1; i++) {
			temp[i+1] = temp[i]+temp[i-1];
		}
		
		System.out.println(temp[temp.length-1]);
		
		
	}

}

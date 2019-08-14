package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String[] array = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for(int i=0; i<array.length; i++) {
			input = input.replaceAll(array[i], "a");
		}
		
		
		System.out.println(input.length());
	
		
	}
	

}


// 매우 간단한 문제인데 replaceAll을 생각하지 못하여 오래걸린 문제
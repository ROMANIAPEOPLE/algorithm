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


// �ſ� ������ �����ε� replaceAll�� �������� ���Ͽ� �����ɸ� ����
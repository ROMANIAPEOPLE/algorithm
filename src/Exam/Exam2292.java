package Exam;

import java.util.Scanner;

public class Exam2292 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int start=1; //ó���� 1
		int add =6; //6�� �����ϴ� ��������
		int count=1;
		
		int myRoom = sc.nextInt();
		
		
		
		while(true) {
			
			if(myRoom <= start) {
				break;
			}
			start+=add;
			add+=6;
			count++;
			
		
			
		}
		
		System.out.println(count);
		
		
	}

}

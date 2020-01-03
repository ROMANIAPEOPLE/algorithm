package Exam;

import java.util.Scanner;

public class Exam2447 {
	static StringBuilder bd = new StringBuilder();
	static int n;
	static int count;
	public static void hanoiTop(int n, int x, int y) {
		
		
		if(n==0) {
			return;
		}
		else {
			count++;
			hanoiTop(n-1,x,6-x-y);
			bd.append(x+ " " + y + "\n");
			hanoiTop(n-1, 6-x-y, y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		hanoiTop(n, 1, 3);
		System.out.println(count);
		System.out.println(bd);

	}
}

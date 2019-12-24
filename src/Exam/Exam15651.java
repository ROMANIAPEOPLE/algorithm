package Exam;

import java.util.Scanner;

public class Exam15651 {
	static int n,m;
	public static void bt(int index, String str) {
		if(index == m) {
			System.out.println(str);
			return;
		}
		
		for(int i=1; i<=n; i++) {
			bt(index+1,str+i + " ");
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 m=sc.nextInt();
		bt(0,"");
	}
}
package Exam;

import java.util.Arrays;
import java.util.Scanner;



public class Exam1759_2 {

	static String [] alpha;
	
	static boolean check(String password) {
		int mo=0;
		int ja=0;
		for(int i=0; i<password.length(); i++) {
			if(password.charAt(i) == 'a'|| password.charAt(i) == 'e' || password.charAt(i) == 'o' || password.charAt(i) == 'i' || password.charAt(i) == 'u') {
				mo++;
			}
			else {
				ja++;
			}
		}
		
		return mo>=1 && ja>=2;
		
	}
	
	
	static void go(int index, int L, String password) {
		if(password.length() == L) {
			if(check(password)) {
				System.out.println(password);
			}
			return;
		}
		if(index == alpha.length) return;
		
		go(index+1,L,password+alpha[index]);
		go(index+1,L,password);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt(); // 암호의 개수
		int C = sc.nextInt();
		
		alpha = new String[C]; 
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = sc.next();
		}
		
		Arrays.parallelSort(alpha);
		go(0,L,"");

		
		
	}
}

package Exam;

import java.util.Scanner;

public class Exam2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2= 0;
		String s = null;
		
		for(int i=0; i<num; i++) {
			num2 = sc.nextInt();
			s = sc.nextLine();

			String result = "";
			for(int j=0; j<s.length(); j++) {
				for(int z=0; z<num2; z++) {
					result +=s.charAt(j);
				}
			}

			result = result.replaceAll(" ", "");
			System.out.println(result);
		}
		
		
	}

}

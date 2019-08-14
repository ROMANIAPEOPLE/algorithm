package Exam;


import java.util.Arrays;
import java.util.Scanner;

public class Exam1475 {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		s=s.replace('6', '9');
		
		int [] temp = new int[10];
		
		
		for(int i=0; i<s.length(); i++) {
			int value = Integer.parseInt(s.substring(i,i+1));
			
			temp[value]++;
		}
		
		if(temp[9] %2 == 0) {
			temp[9]/=2;
		}
		else {
			temp[9]= (temp[9]/2)+1; 
		}
		
		Arrays.parallelSort(temp);
		
		System.out.println(temp[temp.length-1]);
	

		


	}

}

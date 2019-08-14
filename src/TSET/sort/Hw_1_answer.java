package TSET.sort;

import java.util.Arrays;
import java.util.Random;

public class Hw_1_answer {
	
	static void swap(int [] a, int i , int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	static void moveEvenNumbersToFron(int [] a) {
		int start = 0;
		int end = a.length-1;
		
		while(true) {
			while(a[start] % 2==0 && start<end) { // 홀수를 찾을때까지 반복
				++start;
			}
			while(a[end] % 2 ==1 && start<end) { //짝수를 찾을 때 까지 반복
				--end;
			}
			
			if(start>=end) {
				break;
			}
			swap(a,start,end);
		}
	}
	
	 public static void main(String[] args) {     
		 Random random = new Random();      
		 int[] a = new int[20];      
		 for (int i = 0; i < a.length; ++i)   
			 a[i] = random.nextInt(20);     
		 moveEvenNumbersToFron(a);    
		 System.out.println(Arrays.toString(a));

	}

}

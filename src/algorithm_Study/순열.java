package algorithm_Study;

import java.util.Scanner;

//��������
public class ���� {
	
	
	static boolean next(int [] a) {
		int i  = a.length-1;
		while(i > 0 && a[i-1] >= a[i]) {
			i--;
		}
		
		
		if(i<0)  return false;
		
		int j = a.length-1;
		
		while(a[i-1] >= a[j]) {
			j--;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length-1;
		
		while(i<j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int [] a = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			a[i] = sc.nextInt();
		}
		if(next(a)) {
			for(int i : a) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	
}

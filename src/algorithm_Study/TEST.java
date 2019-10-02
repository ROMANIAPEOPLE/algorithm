package algorithm_Study;

import java.util.Scanner;

public class TEST {
	public static void main(String[]args) {

		int fldmf [][] = new int[5][5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<fldmf.length; i++) {
			if(i%2==0) {
				for(int j=0; j<fldmf[i].length; j++) {
					fldmf[i][j] = sc.nextInt();
				}
			}
		
			else {
				for(int j=fldmf[i].length-1; j>=0; j--) {
					fldmf[i][j] = sc.nextInt();
				}
			}
			
			
		}
	
		for(int i=0; i<fldmf.length; i++) {
			for(int j=0; j<fldmf[i].length; j++) {
				System.out.print(fldmf[i][j]);
			}
			System.out.println();
			
		}
		
		
	}
	
}

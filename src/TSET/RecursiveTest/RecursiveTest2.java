package TSET.RecursiveTest;

public class RecursiveTest2 {

	
	 static int factorial(int i) {
		 
		 if( i <= 1) {
			 return 1;
		 }
		 else {
			 return factorial(i-1) *i;
		 }
		
	}
	
	
	public static void main(String[] args) {

		for(int i=2; i<=10; i++) {
			  System.out.printf("%d %d\n", i, factorial(i));

		}
		
		
	}

}

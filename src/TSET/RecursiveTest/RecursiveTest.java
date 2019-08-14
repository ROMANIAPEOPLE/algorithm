package TSET.RecursiveTest;

public class RecursiveTest {

	public static int sum(int n, int [] array) {

		if(n <=0) {
			return 0;
		}
		
		else {
			
			return sum(n-1, array) + array[n-1];
		}
		
	
		
		
	}
	
	
	public static void main(String[] args) {


		int [] array = { 1, 2, 3 ,4, 5};
		int n = array.length;
		sum(n,array);
		
		
		
		
		
		
	}

}

package TSET.RecursiveTest;

public class RecursiveTest4 {

	static int sum(int n) {
		if(n <=0) {
			return 0;
		}
		else {
			return sum(n-1) + n;
		}
	}
	
	public static void main(String[] args) {

		
		for(int i=3; i<=10; i++) {
			System.out.printf("%d %d\n", i , sum(i));
		}
		
		
		
	}

}

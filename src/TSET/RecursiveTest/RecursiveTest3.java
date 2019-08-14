package TSET.RecursiveTest;

public class RecursiveTest3 {

	
	static void recursive( int [] a , int index) {
		if(index >=a.length) {
			return;
			
		}
		else {
			System.out.printf("%d " , a[index]);
			recursive(a,index+1);
			
		}
		
	}
	
	
	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,7,8};
		recursive(a,0);
		
		
	}

}
